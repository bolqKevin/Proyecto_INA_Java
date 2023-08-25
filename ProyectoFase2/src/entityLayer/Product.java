/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entityLayer;

/**
 *
 * @author Kevin Bolaños V.
 */
public class Product {
    
    private int productId;
    private String producName;
    private String description;
    private double price;
    private int initialStock;
    private int currentStock;
    private int reorderQuantity;
    
    public Product(int productId, String producName, String descroption, double price, int initialStock, int currentStock, int reorderQuantity) {
        this.productId = productId;
        this.producName = producName;
        this.description = descroption;
        this.price = price;
        this.initialStock = initialStock;
        this.currentStock = currentStock;
        this.reorderQuantity = reorderQuantity;
    }
    
        public Product() {
        this.productId = 0;
        this.producName = "";
        this.description = "";
        this.price = 0.00;
        this.initialStock = 0;
        this.currentStock = 0;
        this.reorderQuantity = 0;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descroption) {
        this.description = descroption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public int getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(int reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
}
