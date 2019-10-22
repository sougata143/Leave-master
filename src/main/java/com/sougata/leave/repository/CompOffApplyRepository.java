package com.sougata.leave.repository;

import java.sql.Date;

public interface CompOffApplyRepository {
    
    public void compOffApplyForUser(String userId,String leaveTypeId,Date leaveStartDate,Date leaveEnddate,String locationId,String unitId);

}
