package com.example.fare_calculator_back.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@PrimaryKeyClass
public class CalculUtilisateurKey implements Serializable {

    @PrimaryKeyColumn(name = "id_utilisateur", type = PARTITIONED)
    @JsonProperty("id_utilisateur")   // Indique le nom JSON attendu
    private UUID idUtilisateur;

    @PrimaryKeyColumn(name = "timestamp", ordinal = 0, ordering = DESCENDING)
    @JsonProperty("timestamp")         // Pour bien mapper aussi ce champ
    private Instant timestamp;

    // Getters / Setters
    public UUID getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(UUID idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}