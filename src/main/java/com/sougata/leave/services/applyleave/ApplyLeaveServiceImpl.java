
package com.sougata.leave.services.applyleave;

import static com.sougata.leave.constant.LeaveManagementConstant.*;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sougata.leave.dto.LeaveActivityResponse;
import com.sougata.leave.repository.repositoryimpl.LeaveApplyRepositoryImpl;

@RestController
@RequestMapping("/easybusiness/leave/")
public class ApplyLeaveServiceImpl implements ApplyLeaveService {

    @Autowired
    private LeaveApplyRepositoryImpl leaveApplyRepositoryImpl;

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplyLeaveServiceImpl.class);

    @Override
    @CrossOrigin(origins = USER_HOST_SERVER)
    @RequestMapping(value = "applyleave/{userId}/{leaveTypeId}/{leaveStartDate}/{leaveEnddate}/{locationId}/{unitId}/{dayType}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LeaveActivityResponse> applyLeave(@PathVariable("userId") long userId,
														    @PathVariable("leaveTypeId") long leaveTypeId,
														    @PathVariable("leaveStartDate") Date leaveStartDate,
														    @PathVariable("leaveEnddate") Date leaveEnddate,
														    @PathVariable("locationId") long locationId,
														    @PathVariable("unitId") long unitId,
														    @PathVariable("dayType") String dayType) {

	String responseMsg;
	HttpStatus httpStatus;
	try {
	    leaveApplyRepositoryImpl.leaveApplyForUser(userId,
	    		leaveTypeId,
	    		leaveStartDate,
	    		leaveEnddate, 
		    locationId,
		    unitId, dayType);
	    responseMsg = "Leave Successfully Applied";
	    httpStatus = HttpStatus.OK;
	} catch (Exception e) {
	    LOGGER.error("exception while applying leave for user by Id {} , leave apply details {},  {}", userId,
		    userId + "~" + leaveTypeId + "~" + leaveStartDate + "~" + leaveEnddate + "~" + locationId + "~"
			    + unitId + "~" + dayType,
		    e.getMessage());
	    responseMsg = "Leave could not be Applied";
	    httpStatus = HttpStatus.EXPECTATION_FAILED;
	}
	LeaveActivityResponse leaveActivityResponse=new LeaveActivityResponse();
	leaveActivityResponse.setResponseCode(httpStatus.toString());
	leaveActivityResponse.setResponseMessage(responseMsg);
	return new ResponseEntity<LeaveActivityResponse>(leaveActivityResponse, httpStatus);
    }

}
