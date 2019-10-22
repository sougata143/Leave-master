package com.sougata.leave.repository.repositoryimpl;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.repository.CompOffApplyRepository;

@Repository
public class CompOffApplyRepositoryImpl implements CompOffApplyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void compOffApplyForUser(String userId,String leaveTypeId,Date leaveStartDate,Date leaveEnddate,String locationId,String unitId) {

	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_COMPOFF_APPLY_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_USER_ID";
	    String secondParam = "IN_LEAVE_TYPE_ID";
	    String thirdParam = "IN_LEAVE_START_DATE";
	    String fourthParam = "IN_LEAVE_END_DATE";
	    String fifthParam = "IN_LOCATION_ID";
	    String sixthParam = "IN_UNIT_ID";
	    
	    
	    storedProcedure.registerStoredProcedureParameter(firstParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(secondParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(thirdParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fourthParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fifthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(sixthParam, Long.class, ParameterMode.IN);
	    
	    
	    storedProcedure.setParameter(firstParam, Long.parseLong(userId));
	    storedProcedure.setParameter(secondParam, Long.parseLong(leaveTypeId));
	    storedProcedure.setParameter(thirdParam, leaveStartDate);
	    storedProcedure.setParameter(fourthParam, leaveEnddate);
	    storedProcedure.setParameter(fifthParam, Long.parseLong(locationId));
	    storedProcedure.setParameter(sixthParam, Long.parseLong(unitId));
	    

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure to apply compoff   is  " + e.getMessage());
	    e.printStackTrace();
	}
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
