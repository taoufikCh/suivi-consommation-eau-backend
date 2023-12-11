package com.service.localgrpcclient.mapper;


import com.service.localgrpcclient.dto.RegionDto;
import com.service.localgrpcclient.entities.Region;
import com.service.localgrpcclient.stub.RegionOuterClass;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RegionMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public RegionOuterClass.Region fromEntity(Region region){
        return modelMapper.map(region, RegionOuterClass.Region.Builder.class).build();
    }
    public Region fromGrpcSaveRequest(RegionOuterClass.SaveRegionRequest saveRegionRequest)
    {
        return modelMapper.map(saveRegionRequest, Region.class);
    }

    public Region fromGrpcClass(RegionOuterClass.Region region){

        return modelMapper.map(region, Region.class);
    }

    public RegionDto fromGrpcWithoutDistrict(RegionOuterClass.Region region) {
        /*modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        modelMapper.typeMap(RegionOuterClass.Region.class, Region.class)
                .addMappings(mapper -> mapper.skip(Region::setDistrict));
         return modelMapper.map(region, Region.class);*/
        return modelMapper.map(region, RegionDto.class);


    }

    public RegionOuterClass.RegionRequest toGrpcRegionRequest(Region region) {
        System.out.println("region "+region);

          RegionOuterClass.RegionRequest rg= modelMapper.map(region, RegionOuterClass.RegionRequest.Builder.class).build();
          System.out.println("rg "+rg);
          System.out.println("rg get district"+rg.getDistrict());
        return rg;
    }
}
