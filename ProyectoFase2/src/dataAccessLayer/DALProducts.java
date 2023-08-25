/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessLayer;

import config.Config;
import entityLayer.Pet;
import entityLayer.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Bolaños V.
 */
public class DALProducts {
    
    private Connection _cnn;
    private String _message;

    public String getMensaje() {
        return _message;
    }
    
        public DALProducts() throws Exception{
        try{
            String url = Config.getConnectionString();
              _cnn=DriverManager.getConnection(url);
              
        }catch( Exception ex) { 
            throw ex; 
        }    
    }
    public void insertProduct(Product product) throws Exception {
    String query = "INSERT INTO PRODUCTS (PRODUCTNAME, DESCRIPTION_, PRICE, INITIALSTOCK, CURRENTSTOCK, REORDERQUANTITY) VALUES (?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = _cnn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, product.getProducName());
        ps.setString(2, product.getDescription());
        ps.setDouble(3, product.getPrice());
        ps.setInt(4, product.getInitialStock());
        ps.setInt(5, product.getCurrentStock());
        ps.setInt(6, product.getReorderQuantity());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs != null && rs.next()) {
            _message = "Producto guardado de forma satisfactoria";
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    } finally {
        _cnn = null;
    }
}

public List<Product> listProducts(String condition, String order) throws SQLException {
    List<Product> products = new ArrayList();

    try {
        Statement stm = _cnn.createStatement();
        String query = "SELECT PRODUCTID, PRODUCTNAME, DESCRIPTION_, PRICE, INITIALSTOCK, CURRENTSTOCK, REORDERQUANTITY FROM PRODUCTS";

        if (!condition.equals("")) {
            query = String.format("%s WHERE %s", query, condition);
        }

        if (!order.equals("")) {
            query = String.format("%s ORDER BY %s", query, order);
        }

        ResultSet rs = stm.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("PRODUCTID");
            String name = rs.getString("PRODUCTNAME");
            String description = rs.getString("DESCRIPTION_");
            double price = rs.getDouble("PRICE");
            int initialStock = rs.getInt("INITIALSTOCK");
            int currentStock = rs.getInt("CURRENTSTOCK");
            int reorderQuantity = rs.getInt("REORDERQUANTITY");

            Product product = new Product(id, name, description, price, initialStock, currentStock, reorderQuantity);
            products.add(product);
        }

        rs.close();
    } catch (Exception ex) {
        throw ex;
    } finally {
        _cnn = null;
    }

    return products;
}

public Product getProduct(String condition) throws SQLException {
    Product product = new Product();

    ResultSet rs = null;
    try {
        Statement stm = _cnn.createStatement();
        String query = "SELECT PRODUCTID, PRODUCTNAME, DESCRIPTION_, PRICE, INITIALSTOCK, CURRENTSTOCK, REORDERQUANTITY FROM PRODUCTS";
        if (!condition.equals("")) {
            query = String.format("%s WHERE %s", query, condition);
        }
        rs = stm.executeQuery(query);
        if (rs.next()) {
            product.setProductId(rs.getInt(1));
            product.setProducName(rs.getString(2));
            product.setDescription(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            product.setInitialStock(rs.getInt(5));
            product.setCurrentStock(rs.getInt(6));
            product.setReorderQuantity(rs.getInt(7));
        }
    } catch (Exception e) {
        throw e;
    } finally {
        _cnn = null;
    }
    return product;
}

public int updateProduct(Product product) throws SQLException {
    int result = 0;
    try {
        String query = "UPDATE PRODUCTS SET PRODUCTNAME = ?, DESCRIPTION_ = ?, PRICE = ?, INITIALSTOCK = ?, CURRENTSTOCK = ?, REORDERQUANTITY = ? WHERE PRODUCTID = ?";
        PreparedStatement pstm = _cnn.prepareStatement(query);
        pstm.setString(1, product.getProducName());
        pstm.setString(2, product.getDescription());
        pstm.setDouble(3, product.getPrice());
        pstm.setInt(4, product.getInitialStock());
        pstm.setInt(5, product.getCurrentStock());
        pstm.setInt(6, product.getReorderQuantity());
        pstm.setInt(7, product.getProductId());
        result = pstm.executeUpdate();
        if (result > 0) {
            _message = "Producto Modificado con exito";
        }
    } catch (Exception ex) {
        throw ex;
    } finally {
        _cnn = null;
    }
    return result;
}

public int deleteProduct(Product product) throws SQLException {
    int result = 0;
    try {
        String query = "DELETE FROM PRODUCTS WHERE PRODUCTID = ?";
        PreparedStatement pstm = _cnn.prepareStatement(query);
        pstm.setInt(1, product.getProductId());
        result = pstm.executeUpdate();
        if (result > 0) {
            _message = "Producto eliminado con exito";
        }
    } catch (Exception e) {
        throw e;
    } finally {
        _cnn = null;
    }
    return result;
}

public boolean verifyProductIdExists(Product product) throws SQLException {
    boolean result = false;
    try {
        String query = "SELECT COUNT(*) FROM PRODUCTS WHERE PRODUCTID = ?";
        PreparedStatement pstm = _cnn.prepareStatement(query);
        pstm.setInt(1, product.getProductId());
        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            result = count > 0;
        }
    } catch (Exception e) {
        throw e;
    } finally {
        _cnn = null;
    }

    return result;
}
}
