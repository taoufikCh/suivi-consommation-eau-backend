package com.service.report.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilterConsommationStatistic {
    private Long regionId;
    private String dateDebut;
    private String dateFin;

}
