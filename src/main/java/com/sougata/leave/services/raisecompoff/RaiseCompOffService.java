package com.sougata.leave.services.raisecompoff;

import org.springframework.http.ResponseEntity;

import com.sougata.leave.dto.LeaveActivityResponse;

public interface RaiseCompOffService {

    public ResponseEntity<LeaveActivityResponse> raiseCompOff(String userId, String leaveRaiseDate, String locationId, String unitId);

}
