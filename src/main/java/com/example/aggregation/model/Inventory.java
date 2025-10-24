package com.example.aggregation.model;

public class Inventory {
    private String productId;
    private int quantity;
    private boolean inStock;

    public Inventory() {}
    public Inventory(String productId, int quantity, boolean inStock) {
        this.productId = productId;
        this.quantity = quantity;
        this.inStock = inStock;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
