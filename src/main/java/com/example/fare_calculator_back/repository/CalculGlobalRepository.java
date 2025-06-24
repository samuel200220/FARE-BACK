package com.example.fare_calculator_back.repository;

import com.example.fare_calculator_back.model.CalculGlobal;
import com.example.fare_calculator_back.model.CalculGlobalKey;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

public interface CalculGlobalRepository extends ReactiveCassandraRepository<CalculGlobal, CalculGlobalKey> {
    Flux<CalculGlobal> findByKeyDateCalcul(LocalDate date);
}
