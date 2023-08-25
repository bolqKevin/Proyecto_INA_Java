/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccessLayer;

import config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin Bolaños V.
 */
public class DALEmployees {
        private Connection _cnn;
    private String _message;

    public String getMensaje() {
        return _message;
    }
    //Constructor
    public DALEmployees() throws Exception{
        try{
            String url = Config.getConnectionString();
              _cnn=DriverManager.getConnection(url);
              
        }catch( Exception ex) { 
            throw ex; 
        }    
    }
    
    public boolean verifyEmployeeIdExists(String id) throws SQLException {
    boolean result = false;
    try {
        String query = "SELECT COUNT(*) FROM EMPLOYEES WHERE EMPLOYEEID = ?";
        PreparedStatement pstm = _cnn.prepareStatement(query);
        pstm.setString(1, id);
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
