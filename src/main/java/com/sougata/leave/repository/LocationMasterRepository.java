package com.sougata.leave.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sougata.leave.entity.LocationMaster;
import com.sougata.leave.repository.customrepository.LocationMasterCustomRepository;

public interface LocationMasterRepository extends CrudRepository<LocationMaster, Long>, LocationMasterCustomRepository {

    List<LocationMaster> findAll();

    List<LocationMaster> findById(Long id);

}
