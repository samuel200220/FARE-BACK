package com.example.fare_calculator_back.model;

import org.springframework.data.cassandra.core.mapping.*;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.UUID;

@Table("calculs_globaux")
public class CalculGlobal {
    @PrimaryKey
    private CalculGlobalKey key;
    private UUID utilisateurId;
    private String typeUtilisateur;
    private String lieuDepart;
    private String lieuArrivee;
    private LocalTime heurePriseEnCharge;
    private double distanceKm;
    private BigDecimal coutEstime;
    private BigDecimal tarifOfficiel;

    public CalculGlobalKey getKey() {
        return key;
    }

    public void setKey(CalculGlobalKey key) {
        this.key = key;
    }

    public UUID getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(UUID utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(String typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuArrivee() {
        return lieuArrivee;
    }

    public void setLieuArrivee(String lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    public LocalTime getHeurePriseEnCharge() {
        return heurePriseEnCharge;
    }

    public void setHeurePriseEnCharge(LocalTime heurePriseEnCharge) {
        this.heurePriseEnCharge = heurePriseEnCharge;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public BigDecimal getCoutEstime() {
        return coutEstime;
    }

    public void setCoutEstime(BigDecimal coutEstime) {
        this.coutEstime = coutEstime;
    }

    public BigDecimal getTarifOfficiel() {
        return tarifOfficiel;
    }

    public void setTarifOfficiel(BigDecimal tarifOfficiel) {
        this.tarifOfficiel = tarifOfficiel;
    }
}
