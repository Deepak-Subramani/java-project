package com.example.skincancer.repository;

import com.example.skincancer.model.PredictionResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionResultRepository extends JpaRepository<PredictionResult, Long> {
}
