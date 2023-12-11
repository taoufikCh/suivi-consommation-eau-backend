package com.service.consommationgrpcclient.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Bordereau {

    private Long id;
    private String code;
    private String dateGeneration;
    //private Consommation consommation;
    private List<Consommation> consommations;
}
