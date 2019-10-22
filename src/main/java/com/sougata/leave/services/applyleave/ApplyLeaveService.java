package com.sougata.leave.services.applyleave;

import java.sql.Date;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface ApplyLeaveService {

    public ResponseEntity<LeaveActivityResponse> applyLeave(long userId,long leaveTypeId,Date leaveStartDate,
    					Date leaveEnddate,long locationId,long unitId,String dayType);

}
