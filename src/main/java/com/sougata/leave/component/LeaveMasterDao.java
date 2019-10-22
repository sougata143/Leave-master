package com.sougata.leave.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sougata.leave.dto.LeaveMasterDTO;
import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.entity.User;
import com.sougata.leave.repository.LeaveApplyRepository;
import com.sougata.leave.repository.LeaveMasterRepository;
import com.sougata.leave.repository.UserRepository;

@Component
public class LeaveMasterDao {

    @Autowired
    LeaveMasterRepository leaveMasterRepository;
    
    @Autowired
    LeaveApplyRepository leaveApplyRepository;
    
    @Autowired
    UserRepository userRepository;

    public LeaveMaster findByLeaveTypeId(Long leaveTypeId) {
	return leaveMasterRepository.getById(leaveTypeId);
    }

    public LeaveMaster findByLeaveType(String leaveType) {
	return leaveMasterRepository.findByLeaveType(leaveType).get(0);
    }

    public List<LeaveMaster> findAll() {
	return leaveMasterRepository.findAll();
    }

    public LeaveMaster addLeaveMaster(LeaveMasterDTO leaveMaster) {
    User user = userRepository.getUserById(leaveMaster.getUserId());
    long unitId = user.getOrganization().getId();
    	return leaveApplyRepository.leaveApplyForUser(leaveMaster.getUserId(), 
    													Long.valueOf(leaveMaster.getLeaveType()),
    													leaveMaster.getStartDate(),
    													leaveMaster.getEndDate(),
    													user.getLocation().getId(),
    													unitId,
    													leaveMaster.getDayType());
	
    }

    public void deleteLeaveMaster(Long leaveTypeId)

    {
	leaveMasterRepository.deleteLeaveMaster(leaveTypeId);
    }

}
