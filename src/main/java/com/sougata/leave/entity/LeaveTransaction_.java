package com.sougata.leave.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveTransaction.class)
public abstract class LeaveTransaction_ {

	public static volatile SingularAttribute<LeaveTransaction, Date> canceledOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> raisedOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> raisedFor;
	public static volatile SingularAttribute<LeaveTransaction, User> approvedBy;
	public static volatile SingularAttribute<LeaveTransaction, LeaveMaster> leaveMaster;
	public static volatile SingularAttribute<LeaveTransaction, Date> createdOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> availedOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> leaveStartDate;
	public static volatile SingularAttribute<LeaveTransaction, Date> approvedOn;
	public static volatile SingularAttribute<LeaveTransaction, Long> leaveNo;
	public static volatile SingularAttribute<LeaveTransaction, Date> appliedOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> modifiedOn;
	public static volatile SingularAttribute<LeaveTransaction, Date> leaveEndDate;
	public static volatile SingularAttribute<LeaveTransaction, Long> createdBy;
	public static volatile SingularAttribute<LeaveTransaction, User> appliedBy;
	public static volatile SingularAttribute<LeaveTransaction, Long> modifiedBy;
	public static volatile SingularAttribute<LeaveTransaction, Long> id;
	public static volatile SingularAttribute<LeaveTransaction, User> user;
	public static volatile SingularAttribute<LeaveTransaction, String> status;

}

