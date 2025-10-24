package com.example.aggregation.service;

import com.example.aggregation.model.Inventory;
import java.util.concurrent.CompletableFuture;

public interface InventoryService {
    CompletableFuture<Inventory> getInventoryAsync(String productId);
}
