package com.example.fare_calculator_back.controller;

import com.example.fare_calculator_back.model.CalculUtilisateur;
import com.example.fare_calculator_back.repository.CalculUtilisateurRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/calculs-utilisateur")
@CrossOrigin(origins = "*") // autorise CORS
public class CalculUtilisateurController {

    private final CalculUtilisateurRepository repo;

    public CalculUtilisateurController(CalculUtilisateurRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/utilisateur/{id}")
    public Flux<CalculUtilisateur> getByUtilisateur(@PathVariable UUID id) {
        return repo.findByKeyUtilisateurId(id);
    }

    @PostMapping
    public Mono<ResponseEntity<String>> save(@RequestBody CalculUtilisateur calcul) {
        return repo.save(calcul)
                .map(c -> ResponseEntity.ok("Calcul enregistré"))
                .onErrorResume(e -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Erreur: " + e.getMessage())));
    }
}
