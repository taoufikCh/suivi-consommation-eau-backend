package com.service.localgrpcclient.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Region {

    private Long id;
    private String code;
    private String libille;
    private District district;
}
