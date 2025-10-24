package com.example.aggregation.service.impl;

import com.example.aggregation.model.Product;
import com.example.aggregation.service.ProductService;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ProductServiceImpl implements ProductService {
    private final ExecutorService executor;
    private final long simulatedDelayMs;
    private final boolean shouldFail;

    public ProductServiceImpl(ExecutorService executor, long simulatedDelayMs, boolean shouldFail) {
        this.executor = executor;
        this.simulatedDelayMs = simulatedDelayMs;
        this.shouldFail = shouldFail;
    }

    @Override
    public CompletableFuture<Product> getProductAsync(String productId) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(simulatedDelayMs); // Simulate latency
                if (shouldFail) {
                    throw new RuntimeException("Product service failed");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted", e);
            }
            return new Product(productId, "Product-" + productId, "Description for Product " + productId);
        }, executor);
    }
}
