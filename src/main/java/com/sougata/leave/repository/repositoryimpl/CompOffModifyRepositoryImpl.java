package com.sougata.leave.repository.repositoryimpl;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.repository.CompOffModifyRepository;

@Repository
public class CompOffModifyRepositoryImpl implements CompOffModifyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void compOffModifyForUser(String userId,Date leaveStartDate,Date leaveEnddate,String locationId,String unitId) {

	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_COMPOFF_MODIFY_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_USER_ID";
	    String secondparam = "IN_LEAVE_START_DATE";
	    String thirdParam = "IN_LEAVE_END_DATE";
	    String fourthParam = "IN_LOCATION_ID";
	    String fifthParam = "IN_UNIT_ID";
	    
	    
	    storedProcedure.registerStoredProcedureParameter(firstParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(secondparam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(thirdParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fourthParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fifthParam, Long.class, ParameterMode.IN);
	    
	    
	    storedProcedure.setParameter(firstParam, Long.parseLong(userId));
	    storedProcedure.setParameter(secondparam, leaveStartDate);
	    storedProcedure.setParameter(thirdParam, leaveEnddate);
	    storedProcedure.setParameter(fourthParam, Long.parseLong(locationId));
	    storedProcedure.setParameter(fifthParam, Long.parseLong(unitId));
	    

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure to modify compoff   is  " + e.getMessage());
	    e.printStackTrace();
	}
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
