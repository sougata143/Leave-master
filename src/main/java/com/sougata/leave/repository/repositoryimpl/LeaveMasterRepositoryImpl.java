package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.repository.customrepository.LeaveMasterCustomRepository;

@Repository
public class LeaveMasterRepositoryImpl implements LeaveMasterCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(LeaveMaster leaveMaster) {
	
	entityManager.merge(leaveMaster);
    }

    @Override
    public void deleteLeaveMaster(Long id) {
	entityManager.remove(getById(id));
	
    }

    @Override
    public LeaveMaster getById(Long id) {
	return entityManager.find(LeaveMaster.class, id);
    }


}
