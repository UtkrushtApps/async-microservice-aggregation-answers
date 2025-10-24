package com.example.aggregation.service;

import com.example.aggregation.model.Recommendation;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface RecommendationService {
    CompletableFuture<List<Recommendation>> getRecommendationsAsync(String productId, String userId);
}
