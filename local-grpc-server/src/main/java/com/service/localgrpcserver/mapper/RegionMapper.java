package com.service.localgrpcserver.mapper;


import com.service.localgrpcserver.entities.District;
import com.service.localgrpcserver.entities.Region;
import com.service.localgrpcserver.stub.DistrictOuterClass;
import com.service.localgrpcserver.stub.RegionOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RegionMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public RegionOuterClass.Region fromEntity(Region region){
        System.out.println("region in mapper : "+region);
        District d = region.getDistrict();
        DistrictOuterClass.District districtGrpc= modelMapper.map(d, DistrictOuterClass.District.Builder.class).build();
        RegionOuterClass.Region r =modelMapper.map(region, RegionOuterClass.Region.Builder.class)
                .setDistrict(districtGrpc)
                .build();
        System.out.println("r in mapper : "+r);
        return r;
    }
    public Region fromGrpcRegionRequest(RegionOuterClass.SaveRegionRequest request){
        return modelMapper.map(request, Region.class);
    }

    public Region fromGrpcClass(RegionOuterClass.Region region){
        return modelMapper.map(region, Region.class);
    }
}
