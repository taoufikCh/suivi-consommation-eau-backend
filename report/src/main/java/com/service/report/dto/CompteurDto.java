package com.service.report.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompteurDto {
    private Long id;
    private String refCompteur;
    private String refContrat;
    private String dateInstallation;
    private String local;
    private String etatCompteur;
}
