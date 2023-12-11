package com.service.consommationgrpcserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Consommation {
    @Id
    @GeneratedValue
    private Long id;
    private String refFacture;
    private double ancienIndex;
    private double nouveauIndex;
    private double quantite;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    //private String dateDebut;
    //private String dateFin;
    private double montant;
    private boolean etatFacture;
    private String periode;
    private Long compteurId;
    @ManyToOne
    @JoinColumn(name = "bordereau_id")
    private Bordereau bordereau;

    @Override
    public String toString() {
        return "Consommation(id=" + id + ", refFacture=" + refFacture + ", ancienIndex=" + ancienIndex + ", nouveauIndex=" + nouveauIndex + ", quantite=" + quantite + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", montant=" + montant + ", etatFacture=" + etatFacture + ", periode=" + periode + ", compteurId=" + compteurId + ", bordereau=" + bordereau +")";
    }
}
