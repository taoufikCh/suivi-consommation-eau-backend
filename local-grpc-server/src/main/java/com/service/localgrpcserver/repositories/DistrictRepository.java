package com.service.localgrpcserver.repositories;

import com.service.localgrpcserver.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Long> {
    void deleteByIdIn(List<Long> ids);
}
