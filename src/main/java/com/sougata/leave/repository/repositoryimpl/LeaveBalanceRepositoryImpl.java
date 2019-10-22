package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.LeaveBalance;
import com.sougata.leave.repository.customrepository.LeaveBalanceCustomRepository;

@Repository
public class LeaveBalanceRepositoryImpl implements LeaveBalanceCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(LeaveBalance leaveBalance) {

	entityManager.merge(leaveBalance);
    }

    @Override
    public void deleteLeaveBalance(Long id) {
	entityManager.remove(getById(id));

    }

    @Override
    public LeaveBalance getById(Long id) {
	return entityManager.find(LeaveBalance.class, id);
    }

}
