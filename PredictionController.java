package com.example.skincancer.controller;

import com.example.skincancer.model.PredictionResult;
import com.example.skincancer.repository.PredictionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/predictions")
public class PredictionController {

    @Autowired
    private PredictionResultRepository repository;

    @PostMapping
    public PredictionResult savePrediction(@RequestBody PredictionResult prediction) {
        return repository.save(prediction);
    }

    @GetMapping
    public List<PredictionResult> getAllPredictions() {
        return repository.findAll();
    }
}
