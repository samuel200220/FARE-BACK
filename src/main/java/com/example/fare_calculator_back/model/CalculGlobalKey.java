package com.example.fare_calculator_back.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@PrimaryKeyClass
public class CalculGlobalKey implements Serializable {

    @PrimaryKeyColumn(name = "date_calcul", type = PrimaryKeyType.PARTITIONED)
    private LocalDate dateCalcul;

    @PrimaryKeyColumn(name = "id_calcul", type = PrimaryKeyType.CLUSTERED)
    private UUID idCalcul;

    public CalculGlobalKey() {}

    public CalculGlobalKey(LocalDate dateCalcul, UUID idCalcul) {
        this.dateCalcul = dateCalcul;
        this.idCalcul = idCalcul;
    }

    public LocalDate getDateCalcul() {
        return dateCalcul;
    }

    public void setDateCalcul(LocalDate dateCalcul) {
        this.dateCalcul = dateCalcul;
    }

    public UUID getIdCalcul() {
        return idCalcul;
    }

    public void setIdCalcul(UUID idCalcul) {
        this.idCalcul = idCalcul;
    }
}
