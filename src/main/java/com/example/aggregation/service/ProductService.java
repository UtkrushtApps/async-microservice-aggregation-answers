package com.example.aggregation.service;

import com.example.aggregation.model.Product;
import java.util.concurrent.CompletableFuture;

public interface ProductService {
    CompletableFuture<Product> getProductAsync(String productId);
}
