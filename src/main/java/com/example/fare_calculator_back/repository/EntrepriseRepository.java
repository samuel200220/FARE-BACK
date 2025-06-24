package com.example.fare_calculator_back.repository;

import com.example.fare_calculator_back.model.Entreprise;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface EntrepriseRepository extends ReactiveCassandraRepository<Entreprise, UUID> {
    @AllowFiltering
    Mono<Entreprise> findByEmail(String email);
}
