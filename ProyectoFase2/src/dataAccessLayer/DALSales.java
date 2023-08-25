/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessLayer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Bolaños V.
 */
public class DALSales {
    
    private static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=VeterinaryManagement;user=sa;password=sa";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
    
public static int createSale(String saleDate, String clientID, String employeeID, String discount, DefaultTableModel model) throws SQLException {
    int generatedSaleID = -1;
    Connection connection = getConnection();

    try {
        // Insert into SALES 
        String insertSaleQuery = "INSERT INTO SALES (SALEDATE, CLIENTID, EMPLOYEEID, DISCOUNT) VALUES (?, ?, ?, ?)";
        PreparedStatement saleStatement = connection.prepareStatement(insertSaleQuery, PreparedStatement.RETURN_GENERATED_KEYS);
        saleStatement.setString(1, saleDate);
        saleStatement.setString(2, clientID);
        saleStatement.setString(3, employeeID);
        saleStatement.setString(4, discount);
        saleStatement.executeUpdate();

        ResultSet generatedKeys = saleStatement.getGeneratedKeys();
        if (generatedKeys.next()) {
            generatedSaleID = generatedKeys.getInt(1);
        }

        // Insert into SALE_DETAIL table
        String insertSaleDetailQuery = "INSERT INTO SALE_DETAIL (SALEID, PRODUCTID, QUANTITY, UNITPRICE) VALUES (?, ?, ?, ?)";
        PreparedStatement saleDetailStatement = connection.prepareStatement(insertSaleDetailQuery);

        for (int row = 0; row < model.getRowCount(); row++) {
            int productID = (int) model.getValueAt(row, 0);
            int quantity = (int) model.getValueAt(row, 4); // Columna que contiene la cantidad
            double unitPrice = Double.parseDouble((String) model.getValueAt(row, 5)); // Columna que contiene el precio con impuestos

            saleDetailStatement.setInt(1, generatedSaleID);
            saleDetailStatement.setInt(2, productID);
            saleDetailStatement.setInt(3, quantity);
            saleDetailStatement.setDouble(4, unitPrice);
            saleDetailStatement.executeUpdate();

            // Actualizar existencias en la tabla PRODUCTS (aquí asumo que debes restar la cantidad vendida)
            String updateStockQuery = "UPDATE PRODUCTS SET CURRENTSTOCK = CURRENTSTOCK - ? WHERE PRODUCTID = ?";
            PreparedStatement updateStockStatement = connection.prepareStatement(updateStockQuery);
            updateStockStatement.setInt(1, quantity);
            updateStockStatement.setInt(2, productID);
            updateStockStatement.executeUpdate();
            updateStockStatement.close();
        }

        generatedKeys.close();
        saleDetailStatement.close();
        saleStatement.close();
    } catch (SQLException e) {
        throw e;
    } finally {
        connection.close();
    }

    return generatedSaleID;
}
}

