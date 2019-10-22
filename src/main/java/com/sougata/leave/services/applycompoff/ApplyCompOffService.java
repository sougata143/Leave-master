package com.sougata.leave.services.applycompoff;

import java.sql.Date;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface ApplyCompOffService {

    public ResponseEntity<LeaveActivityResponse> applyCompOff(String userId, String leaveTypeId, Date leaveStartDate,
	    Date leaveEnddate, String locationId, String unitId);

}
