package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.sougata.leave.repository.LeaveUpdateUserCreationRepository;

@Repository
public class LeaveUpdateUserCreationRepositoryImpl implements LeaveUpdateUserCreationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void leaveUpdateForUserCreation(String userId) {

	try {
	    StoredProcedureQuery storedProcedure = entityManager
		    .createStoredProcedureQuery("USER_CREATE_PROC");

	    // Set the parameters of the stored procedure.
	    String firstParam = "IN_USER_ID";
	    storedProcedure.registerStoredProcedureParameter(firstParam, Long.class, ParameterMode.IN);
	    storedProcedure.setParameter(firstParam, Long.parseLong(userId));

	    storedProcedure.execute();
	} catch (Exception e) {
	    System.out.println("exception caught while calling procedure is  " + e.getMessage());
	    e.printStackTrace();
	}
	/*
	 * // Call the stored procedure. List<Object[]> storedProcedureResults =
	 * storedProcedure.getResultList();
	 */

    }

}
