package com.sougata.leave.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveBalance.class)
public abstract class LeaveBalance_ {

	public static volatile SingularAttribute<LeaveBalance, LocationMaster> locationMaster;
	public static volatile SingularAttribute<LeaveBalance, Long> leaveEarned;
	public static volatile SingularAttribute<LeaveBalance, Long> leaveBalance;
	public static volatile SingularAttribute<LeaveBalance, Date> validFrom;
	public static volatile SingularAttribute<LeaveBalance, LeaveMaster> leaveMaster;
	public static volatile SingularAttribute<LeaveBalance, Date> createdOn;
	public static volatile SingularAttribute<LeaveBalance, Long> leaveLapsed;
	public static volatile SingularAttribute<LeaveBalance, Long> totalLeave;
	public static volatile SingularAttribute<LeaveBalance, Date> modifiedOn;
	public static volatile SingularAttribute<LeaveBalance, Long> leaveApplied;
	public static volatile SingularAttribute<LeaveBalance, Long> createdBy;
	public static volatile SingularAttribute<LeaveBalance, Long> modifiedBy;
	public static volatile SingularAttribute<LeaveBalance, Long> id;
	public static volatile SingularAttribute<LeaveBalance, User> user;
	public static volatile SingularAttribute<LeaveBalance, Long> openingBalance;
	public static volatile SingularAttribute<LeaveBalance, Date> validTo;

}

