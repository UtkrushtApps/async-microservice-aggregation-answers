package com.example.aggregation.model;

public class Recommendation {
    private String productId;
    private String recommendedProductId;
    private String reason;

    public Recommendation() {}
    public Recommendation(String productId, String recommendedProductId, String reason) {
        this.productId = productId;
        this.recommendedProductId = recommendedProductId;
        this.reason = reason;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getRecommendedProductId() {
        return recommendedProductId;
    }

    public void setRecommendedProductId(String recommendedProductId) {
        this.recommendedProductId = recommendedProductId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
