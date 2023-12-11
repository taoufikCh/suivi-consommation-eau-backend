package com.service.report.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsommationStatisticDto {
    private Long id;
    private String refFacture;
    private double ancienIndex;
    private double nouveauIndex;
    private double quantite;
    private String dateDebut;
    private String dateFin;
    private double montant;
    private String etatFacture;

}
