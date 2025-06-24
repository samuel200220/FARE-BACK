package com.example.fare_calculator_back.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.cassandra.core.mapping.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Table("calculs_utilisateur")
public class CalculUtilisateur {

    @PrimaryKey
    private CalculUtilisateurKey key;

    @Column("lieu_depart")
    @JsonProperty("lieu_depart")
    private String lieuDepart;

    @Column("lieu_arrivee")
    @JsonProperty("lieu_arrivee")
    private String lieuArrivee;

    @Column("heure_prise_en_charge")
    @JsonProperty("heure_prise_en_charge")
    private LocalTime heurePriseEnCharge;

    @Column("distance_km")
    @JsonProperty("distance_km")
    private double distanceKm;

    @Column("cout_estime")
    @JsonProperty("cout_estime")
    private BigDecimal coutEstime;

    @Column("tarif_officiel")
    @JsonProperty("tarif_officiel")
    private BigDecimal tarifOfficiel;

    // getters et setters restent identiques...

    public CalculUtilisateurKey getKey() {
        return key;
    }

    public void setKey(CalculUtilisateurKey key) {
        this.key = key;
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