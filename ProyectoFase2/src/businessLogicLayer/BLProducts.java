/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessLogicLayer;
import dataAccessLayer.DALProducts;
import entityLayer.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Kevin Bolaños V.
 */
public class BLProducts {
     private String _message;

    public String getMessage() {
        return _message;
    }

    public void insertProduct(Product product) throws Exception {
        DALProducts adproduct;
        try {
            adproduct = new DALProducts();
            adproduct.insertProduct(product);
            _message = adproduct.getMensaje();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List<Product> listProducts(String condition, String order) throws SQLException, Exception {
        List<Product> result = new ArrayList();
        DALProducts dalproducts;
        try {
            dalproducts = new DALProducts();
            result = dalproducts.listProducts(condition, order);
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    public Product getProduct(String condition) throws Exception {
        Product product;
        DALProducts dalproducts;
        try {
            dalproducts = new DALProducts();
            product = dalproducts.getProduct(condition);
        } catch (Exception e) {
            throw e;
        }
        return product;
    }

    public void updateProduct(Product product) throws Exception {
        DALProducts dalproducts;
        try {
            dalproducts = new DALProducts();
            dalproducts.updateProduct(product);
            _message = dalproducts.getMensaje();
        } catch (Exception e) {
            throw e;
        }
    }

    public int deleteProduct(Product product) throws Exception {
        DALProducts dalproducts;
        int result = -1;
        try {
            dalproducts = new DALProducts();
            result = dalproducts.deleteProduct(product);
            _message = dalproducts.getMensaje();
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    public boolean verifyProductIdExists(Product product) throws Exception {
        DALProducts adproduct;
        boolean result = false;
        try {
            adproduct = new DALProducts();
            result = adproduct.verifyProductIdExists(product);
            _message = adproduct.getMensaje();
        } catch (Exception e) {
            throw e;
        }
        return result;
    }
}
