package com.example.fare_calculator_back.controller;

import com.example.fare_calculator_back.model.UtilisateurSimple;
import com.example.fare_calculator_back.repository.UtilisateurSimpleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurSimpleController {

    private final UtilisateurSimpleRepository repository;

    public UtilisateurSimpleController(UtilisateurSimpleRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Mono<UtilisateurSimple> create(@RequestBody UtilisateurSimple user) {
        user.setId(UUID.randomUUID());
        user.setDateCreation(Instant.now());
        return repository.save(user);
    }

    @GetMapping("/{id}")
    public Mono<UtilisateurSimple> getById(@PathVariable UUID id) {
        return repository.findById(id);
    }

//    @GetMapping("/email/{email}")
//    public Mono<UtilisateurSimple> getByEmail(@PathVariable String email) {
//        return repository.findByEmail(email);
//    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable UUID id) {
        return repository.deleteById(id);
    }
    @GetMapping("/email/{email}")
    public Mono<ResponseEntity<UtilisateurSimple>> getByEmail(@PathVariable String email) {
        return repository.findByEmail(email)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
