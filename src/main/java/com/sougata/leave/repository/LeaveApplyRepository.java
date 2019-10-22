package com.sougata.leave.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.sougata.leave.entity.LeaveMaster;

public interface LeaveApplyRepository {
    
    public LeaveMaster leaveApplyForUser(
    		long userId,
    		long leaveTypeId,
    		Date leaveStartDate,
    		Date leaveEnddate,
    		long locationId,
    		long unitId,
    		String dayType);

   /* @Procedure(name="USER_LEAVE_APPLY_PROC")
    void userLeaveApplyProc(@Param("IN_USER_ID") long IN_USER_ID,
    						@Param("IN_LEAVE_TYPE_ID") long IN_LEAVE_TYPE_ID,
    						@Param("IN_LEAVE_START_DATE") Date IN_LEAVE_START_DATE,
    						@Param("IN_LEAVE_END_DATE") Date IN_LEAVE_END_DATE,
    						@Param("IN_LOCATION_ID") long IN_LOCATION_ID,
    						@Param("IN_UNIT_ID") long IN_UNIT_ID,
    						@Param("IN_DAY_TYPE") String IN_DAY_TYPE);
    */
    
}
