package com.example.fare_calculator_back.repository;

import com.example.fare_calculator_back.model.CalculUtilisateur;
import com.example.fare_calculator_back.model.CalculUtilisateurKey;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface CalculUtilisateurRepository extends ReactiveCassandraRepository<CalculUtilisateur, CalculUtilisateurKey> {

    @Query("SELECT * FROM calculs_utilisateur WHERE id_utilisateur = ?0 ALLOW FILTERING")
    Flux<CalculUtilisateur> findByKeyUtilisateurId(UUID idUtilisateur);
}
