package com.sougata.leave.services.cancelcompoff;

import static com.sougata.leave.constant.LeaveManagementConstant.USER_HOST_SERVER;

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
import com.sougata.leave.repository.repositoryimpl.CompOffCancelRepositoryImpl;

@RestController
@RequestMapping("/easybusiness/leave/")
public class CancelCompOffServiceImpl implements CancelCompOffService {

    @Autowired
    private CompOffCancelRepositoryImpl compOffCancelRepositoryImpl;

    private static final Logger LOGGER = LoggerFactory.getLogger(CancelCompOffServiceImpl.class);

    @Override
    @CrossOrigin(origins = USER_HOST_SERVER)
    @RequestMapping(value = "cancelcompoff/{userId}/{leaveStartDate}/{leaveEnddate}/{locationId}/{unitId}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LeaveActivityResponse> cancelCompOff(
    		@PathVariable("userId") String userId,
    		@PathVariable("leaveStartDate") Date leaveStartDate,
    		@PathVariable("leaveEnddate") Date leaveEnddate,
    		@PathVariable("locationId") String locationId,
    		@PathVariable("unitId") String unitId) {

	String responseMsg;
	HttpStatus httpStatus;
	try {
	    compOffCancelRepositoryImpl.compOffCancelForUser(userId,
	    		leaveStartDate,
	    		leaveEnddate,
	    		locationId,
		    unitId);
	    responseMsg = "CompOff Canceled Successfully";
	    httpStatus = HttpStatus.OK;
	} catch (Exception e) {
	    LOGGER.error("exception while canceling CompOff for user by Id {} , leave apply details {},  {}", userId,
		    userId + "~" + leaveStartDate + "~" + leaveEnddate + "~" + locationId + "~" + unitId,
		    e.getMessage());
	    responseMsg = "CompOff could not be canceled";
	    httpStatus = HttpStatus.EXPECTATION_FAILED;
	}
	LeaveActivityResponse leaveActivityResponse = new LeaveActivityResponse();
	leaveActivityResponse.setResponseCode(httpStatus.toString());
	leaveActivityResponse.setResponseMessage(responseMsg);
	return new ResponseEntity<LeaveActivityResponse>(leaveActivityResponse, httpStatus);
    }

}
