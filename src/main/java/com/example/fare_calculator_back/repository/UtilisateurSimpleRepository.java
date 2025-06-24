package com.example.fare_calculator_back.repository;

import com.example.fare_calculator_back.model.UtilisateurSimple;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UtilisateurSimpleRepository extends ReactiveCassandraRepository<UtilisateurSimple, UUID> {
    Mono<UtilisateurSimple> findByEmail(String email);
}

