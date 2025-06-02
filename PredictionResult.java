package com.example.skincancer.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PredictionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientId;
    private String imageName;
    private String predictedLabel;
    private Float confidence;

    private LocalDateTime predictionDate = LocalDateTime.now();

    // Getters and Setters
}
