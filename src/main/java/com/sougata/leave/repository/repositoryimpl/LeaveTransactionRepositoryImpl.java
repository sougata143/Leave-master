package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.LeaveTransaction;
import com.sougata.leave.repository.customrepository.LeaveTransactionCustomRepository;

@Repository
public class LeaveTransactionRepositoryImpl implements LeaveTransactionCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(LeaveTransaction leaveTransaction) {

	entityManager.merge(leaveTransaction);
    }

    @Override
    public void deleteLeaveTransaction(Long id) {
	entityManager.remove(getById(id));

    }

    @Override
    public LeaveTransaction getById(Long id) {
	return entityManager.find(LeaveTransaction.class, id);
    }

}
