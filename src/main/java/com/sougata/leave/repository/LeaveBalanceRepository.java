package com.sougata.leave.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sougata.leave.entity.LeaveBalance;
import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.entity.User;
import com.sougata.leave.repository.customrepository.LeaveBalanceCustomRepository;

public interface LeaveBalanceRepository extends CrudRepository<LeaveBalance, Long>, LeaveBalanceCustomRepository {

    List<LeaveBalance> findAll();

    List<LeaveBalance> findById(Long id);

    List<LeaveBalance> findByUser(User user);

    List<LeaveBalance> findByLeaveMaster(LeaveMaster leavemaster);

    List<LeaveBalance> findByUserAndLeaveMaster(User user, LeaveMaster leavemaster);

    @SuppressWarnings("unchecked")
    LeaveBalance save(LeaveBalance leaveBalance);

}
