package com.sougata.leave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.entity.LeaveTransaction;
import com.sougata.leave.entity.User;
import com.sougata.leave.repository.customrepository.LeaveTransactionCustomRepository;

public interface LeaveTransactionRepository extends CrudRepository<LeaveTransaction, Long>,
	LeaveTransactionCustomRepository, JpaSpecificationExecutor<LeaveTransaction> {

    List<LeaveTransaction> findAll();

    List<LeaveTransaction> findById(Long id);

    List<LeaveTransaction> findByUser(User user);

    List<LeaveTransaction> findByLeaveMaster(LeaveMaster leavemaster);

    List<LeaveTransaction> findByUserAndLeaveMaster(User user, LeaveMaster leavemaster);
    
    List<LeaveTransaction> findByStatus(String status);

    @SuppressWarnings("unchecked")
    LeaveTransaction save(LeaveTransaction leaveTransaction);

}
