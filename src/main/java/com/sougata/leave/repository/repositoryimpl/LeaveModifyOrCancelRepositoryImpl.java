package com.sougata.leave.repository.repositoryimpl;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.repository.LeaveModifyOrCancelRepository;

@Repository
public class LeaveModifyOrCancelRepositoryImpl implements LeaveModifyOrCancelRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void leaveModifyOrCancelForUser(String operationType,String userId,String leaveTypeId,String leaveTransactionId,Date leaveStartDate,Date leaveEnddate,String locationId,String unitId,String dayType) {
	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_LEAVE_MODORCAN_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_OPERATION_TYPE";
	    String secondParam = "IN_USER_ID";
	    String thirdParam = "IN_LEAVE_TYPE_ID";
	    String fourthParam = "IN_LEAVE_TRAN_ID";
	    String fifthParam = "IN_LEAVE_START_DATE";
	    String sixthParam = "IN_LEAVE_END_DATE";
	    String seventhParam = "IN_LOCATION_ID";
	    String eighthParam = "IN_UNIT_ID";
	    String ninthParam = "IN_DAY_TYPE";
	    
	    storedProcedure.registerStoredProcedureParameter(firstParam, String.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(secondParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(thirdParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fourthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fifthParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(sixthParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(seventhParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(eighthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(ninthParam, String.class, ParameterMode.IN);
	    
	    storedProcedure.setParameter(firstParam, operationType);
	    storedProcedure.setParameter(secondParam, Long.parseLong(userId));
	    storedProcedure.setParameter(thirdParam, Long.parseLong(leaveTypeId));
	    storedProcedure.setParameter(fourthParam, Long.parseLong(leaveTransactionId));
	    storedProcedure.setParameter(fifthParam, leaveStartDate);
	    storedProcedure.setParameter(sixthParam, leaveEnddate);
	    storedProcedure.setParameter(seventhParam, Long.parseLong(locationId));
	    storedProcedure.setParameter(eighthParam, Long.parseLong(unitId));
	    storedProcedure.setParameter(ninthParam, dayType);

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure to modify/cancel leave  is  " + e.getMessage());
	    e.printStackTrace();
	}
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
