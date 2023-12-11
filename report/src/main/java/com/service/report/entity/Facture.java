package com.service.report.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Facture {
    private String ref_facture;
    private String compteur;
    private String local;
    private String periode;
    private String volume;
    private double montant;
    private String date;
    private String paye;

}
