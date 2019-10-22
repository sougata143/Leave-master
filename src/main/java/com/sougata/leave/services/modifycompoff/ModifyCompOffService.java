package com.sougata.leave.services.modifycompoff;

import java.sql.Date;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface ModifyCompOffService {

    public ResponseEntity<LeaveActivityResponse> modifyCompOff(String userId, Date leaveStartDate,
	    Date leaveEnddate, String locationId, String unitId);

}
