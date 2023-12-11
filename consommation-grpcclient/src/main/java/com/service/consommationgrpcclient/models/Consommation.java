package com.service.consommationgrpcclient.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Consommation {

    private Long id;
    private String refFacture;
    private double ancienIndex;
    private double nouveauIndex;
    private double quantite;
    private String dateDebut;
    private String dateFin;
    private double montant;
    private boolean etatFacture;
    private String periode;
    private Long compteurId;
    private Bordereau bordereau;
}
