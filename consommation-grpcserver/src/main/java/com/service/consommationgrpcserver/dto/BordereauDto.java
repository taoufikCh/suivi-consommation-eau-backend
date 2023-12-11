package com.service.consommationgrpcserver.dto;


import com.service.consommationgrpcserver.models.Consommation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BordereauDto {

    private Long id;
    private String code;
    private String dateGeneration;

}

