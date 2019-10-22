package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.LocationMaster;
import com.sougata.leave.repository.customrepository.LocationMasterCustomRepository;

@Repository
public class LocationMasterRepositoryImpl implements LocationMasterCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public LocationMaster getById(Long id) {
	return entityManager.find(LocationMaster.class, id);
    }

}
