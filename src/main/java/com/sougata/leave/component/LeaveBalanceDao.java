package com.sougata.leave.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sougata.leave.entity.LeaveBalance;
import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.entity.User;
import com.sougata.leave.repository.LeaveBalanceRepository;

@Component
public class LeaveBalanceDao {

    @Autowired
    LeaveBalanceRepository leaveBalanceRepository;

    @Autowired
    UserDao userDao;

    @Autowired
    LeaveMasterDao leaveMasterDao;

    public LeaveBalance findByLeaveBalanceId(Long leaveBalanceId) {
	return leaveBalanceRepository.getById(leaveBalanceId);
    }

    public List<LeaveBalance> findLeaveBalanceByUser(User user) {
	return leaveBalanceRepository.findByUser(user);
    }

    public List<LeaveBalance> findLeaveBalanceByUserAndLeaveType(User user, LeaveMaster leaveMaster) {
	return leaveBalanceRepository.findByUserAndLeaveMaster(user, leaveMaster);
    }

    public List<LeaveBalance> findLeaveBalanceByUserIdAndLeaveTypeId(Long userId, Long leaveTypeId) {

	return leaveBalanceRepository.findByUserAndLeaveMaster(userDao.findUserById(userId),
		leaveMasterDao.findByLeaveTypeId(leaveTypeId));
    }

    public List<LeaveBalance> findLeaveBalanceByUserId(Long userId) {
	return leaveBalanceRepository.findByUser(userDao.findUserById(userId));
    }

    public List<LeaveBalance> findLeaveBalanceByUserName(String userName) {
	return leaveBalanceRepository.findByUser(userDao.findByUserName(userName));
    }

    public List<LeaveBalance> findLeaveBalanceByUserNameAndLeaveTypeId(String userName, Long leaveTypeId) {

	return leaveBalanceRepository.findByUserAndLeaveMaster(userDao.findByUserName(userName),
		leaveMasterDao.findByLeaveTypeId(leaveTypeId));
    }

    public List<LeaveBalance> findAll() {
	return leaveBalanceRepository.findAll();
    }

    public LeaveBalance addLeaveBalance(LeaveBalance leaveMaster)

    {
	return leaveBalanceRepository.save(leaveMaster);
    }

    public void deleteLeaveBalance(Long leaveTypeId)

    {
	leaveBalanceRepository.deleteLeaveBalance(leaveTypeId);
    }

}
