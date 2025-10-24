package com.example.aggregation.model;

import java.util.List;

public class ProductDetailsResponse {
    private Product product;
    private Inventory inventory;
    private List<Recommendation> recommendations;
    private List<String> errors;

    public ProductDetailsResponse() {}
    public ProductDetailsResponse(Product product, Inventory inventory, List<Recommendation> recommendations, List<String> errors) {
        this.product = product;
        this.inventory = inventory;
        this.recommendations = recommendations;
        this.errors = errors;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
