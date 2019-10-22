package com.sougata.leave.repository.customrepository;

import com.sougata.leave.entity.LeaveTransaction;

public interface LeaveTransactionCustomRepository {

    public void add(LeaveTransaction leaveTransaction);

    public void deleteLeaveTransaction(Long id);

    LeaveTransaction getById(Long id);

}
