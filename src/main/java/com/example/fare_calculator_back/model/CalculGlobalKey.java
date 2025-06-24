package com.example.fare_calculator_back.model;

import java.time.LocalDate;
import java.util.UUID;

public class CalculGlobalKey {
    private LocalDate dateCalcul;
    private UUID idCalcul;

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
