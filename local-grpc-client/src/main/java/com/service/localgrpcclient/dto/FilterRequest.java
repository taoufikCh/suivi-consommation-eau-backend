package com.service.localgrpcclient.dto;

import com.service.localgrpcclient.entities.NatureExercise;
import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.entities.TypeLocal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilterRequest {
    private Region region;
    private NatureExercise nature_exercise;
    private TypeLocal type_local;
}
