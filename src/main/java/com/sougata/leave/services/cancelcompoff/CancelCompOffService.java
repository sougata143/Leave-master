package com.sougata.leave.services.cancelcompoff;

import java.sql.Date;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface CancelCompOffService {

    public ResponseEntity<LeaveActivityResponse> cancelCompOff(String userId, Date leaveStartDate, Date leaveEnddate,
	    String locationId, String unitId);

}
