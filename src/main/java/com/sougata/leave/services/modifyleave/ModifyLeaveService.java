package com.sougata.leave.services.modifyleave;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface ModifyLeaveService {

    public ResponseEntity<LeaveActivityResponse> modifyOrCancelLeave(String operationType, String userId, String leaveTypeId,
	    String leaveTransactionId, String leaveStartDate, String leaveEnddate, String locationId, String unitId,
	    String dayType);

}
