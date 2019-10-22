package com.sougata.leave.repository;

import java.sql.Date;

public interface CompOffModifyRepository {
    
    public void compOffModifyForUser(String userId,Date leaveStartDate,Date leaveEnddate,String locationId,String unitId);

}
