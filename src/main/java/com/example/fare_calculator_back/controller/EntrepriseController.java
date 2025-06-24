package com.example.fare_calculator_back.controller;

import com.example.fare_calculator_back.model.Entreprise;
import com.example.fare_calculator_back.repository.EntrepriseRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/api/entreprises")
public class EntrepriseController {
    private final EntrepriseRepository repo;
    public EntrepriseController(EntrepriseRepository repo) { this.repo = repo; }

    @GetMapping
    public Flux<Entreprise> all() { return repo.findAll(); }
    @PostMapping
    public Mono<Entreprise> save(@RequestBody Entreprise e) {
        e.setId(UUID.randomUUID());
        e.setDateCreation(Instant.now());
        return repo.save(e);
    }
    @GetMapping("/email/{email}") public Mono<Entreprise> byEmail(@PathVariable String email) { return repo.findByEmail(email); }
    @DeleteMapping("/{id}") public Mono<Void> delete(@PathVariable UUID id) { return repo.deleteById(id); }
}
