package com.example.fare_calculator_back.controller;

import com.example.fare_calculator_back.model.CalculGlobal;
import com.example.fare_calculator_back.repository.CalculGlobalRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/calculs-globaux")
public class CalculGlobalController {
    private final CalculGlobalRepository repo;
    public CalculGlobalController(CalculGlobalRepository repo) { this.repo = repo; }

    @GetMapping("/date/{date}")
    public Flux<CalculGlobal> getByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return repo.findByKeyDateCalcul(date);
    }

    @PostMapping
    public Mono<CalculGlobal> save(@RequestBody CalculGlobal c) {
        return repo.save(c);
    }
}
