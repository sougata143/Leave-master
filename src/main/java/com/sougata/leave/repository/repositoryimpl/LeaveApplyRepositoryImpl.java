package com.sougata.leave.repository.repositoryimpl;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.LeaveMaster;
import com.sougata.leave.repository.LeaveApplyRepository;

@Repository
public class LeaveApplyRepositoryImpl implements LeaveApplyRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    
    @Override
    public LeaveMaster leaveApplyForUser(long userId,long leaveTypeId,Date leaveStartDate,Date leaveEnddate,long locationId,long unitId,String dayType) {

	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_LEAVE_APPLY_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_USER_ID";
	    String secondParam = "IN_LEAVE_TYPE_ID";
	    String thirdParam = "IN_LEAVE_START_DATE";
	    String fourthParam = "IN_LEAVE_END_DATE";
	    String fifthParam = "IN_LOCATION_ID";
	    String sixthParam = "IN_UNIT_ID";
	    String seventhParam = "IN_DAY_TYPE";
	    
	    storedProcedure.registerStoredProcedureParameter(firstParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(secondParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(thirdParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fourthParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fifthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(sixthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(seventhParam, String.class, ParameterMode.IN);
	    
	    storedProcedure.setParameter(firstParam, userId);
	    storedProcedure.setParameter(secondParam, leaveTypeId);
	    storedProcedure.setParameter(thirdParam, leaveStartDate);
	    storedProcedure.setParameter(fourthParam, leaveEnddate);
	    storedProcedure.setParameter(fifthParam, locationId);
	    storedProcedure.setParameter(sixthParam, unitId);
	    storedProcedure.setParameter(seventhParam, dayType);

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure to apply leave  is  " + e.getMessage());
	    e.printStackTrace();
	}
	LeaveMaster leaveEntity = entityManager.find(LeaveMaster.class, leaveTypeId);
	return leaveEntity;
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
