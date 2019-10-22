package com.sougata.leave.repository.repositoryimpl;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.repository.CompOffRaiseRepository;

@Repository
public class CompOffRaiseRepositoryImpl implements CompOffRaiseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void compOffRaise(String userId,Date leaveRaiseDate,String locationId,String unitId) {
	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_COMPOFF_RAISE_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_USER_ID";
	    String secondParam = "IN_LEAVE_RAISE_DATE";
	    String thirdParam = "IN_LOCATION_ID";
	    String fourthParam = "IN_UNIT_ID";
	    
	    storedProcedure.registerStoredProcedureParameter(firstParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(secondParam, Date.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(thirdParam, Long.class, ParameterMode.IN);
	    storedProcedure.registerStoredProcedureParameter(fourthParam, Long.class, ParameterMode.IN);
	    
	    storedProcedure.setParameter(firstParam, Long.parseLong(userId));
	    storedProcedure.setParameter(secondParam, leaveRaiseDate);
	    storedProcedure.setParameter(thirdParam, Long.parseLong(locationId));
	    storedProcedure.setParameter(fourthParam, Long.parseLong(unitId));

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure to raise compoff   is  " + e.getMessage());
	    e.printStackTrace();
	}
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
