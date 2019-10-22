package com.sougata.leave.repository;

import java.sql.Date;

public interface CompOffRaiseRepository {
    
    public void compOffRaise(String userId,Date leaveRaiseDate,String locationId,String unitId);

}
