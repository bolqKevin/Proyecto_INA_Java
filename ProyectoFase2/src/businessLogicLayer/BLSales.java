/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessLogicLayer;

import dataAccessLayer.DALSales;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Bolaños V.
 */
public class BLSales {
          public int createSale(String saleDate, String clientID, String employeeId, String discount , DefaultTableModel model) throws SQLException {
        try {
            return DALSales.createSale(saleDate, clientID, employeeId, discount, model);
        } catch (SQLException e) {
            throw e;
        }
    }
}
