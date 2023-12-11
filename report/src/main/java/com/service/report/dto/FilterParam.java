package com.service.report.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilterParam {
    private String district;
    private String region;
    private String dateDebut;
    private String dateFin;
    private String local;
    private String type_local;
    private String nature_exercice;

}
