package com.sougata.leave.repository.customrepository;

import com.sougata.leave.entity.LeaveBalance;

public interface LeaveBalanceCustomRepository {

    public void add(LeaveBalance leaveBalance);

    public void deleteLeaveBalance(Long id);

    LeaveBalance getById(Long id);

}
