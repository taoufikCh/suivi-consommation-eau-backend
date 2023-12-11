package com.service.localgrpcserver.repositories;

import com.service.localgrpcserver.entities.District;
import com.service.localgrpcserver.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {
    void deleteByIdIn(List<Long> ids);
    List<Region> getRegionsByDistrict(District district);
}
