package com.sougata.leave.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveMaster.class)
public abstract class LeaveMaster_ {

	public static volatile SingularAttribute<LeaveMaster, Date> modifiedOn;
	public static volatile SingularAttribute<LeaveMaster, String> leaveType;
	public static volatile SingularAttribute<LeaveMaster, Character> isCarryForward;
	public static volatile SingularAttribute<LeaveMaster, Long> createdBy;
	public static volatile SingularAttribute<LeaveMaster, Long> maxNumInAYear;
	public static volatile SingularAttribute<LeaveMaster, Long> carryForwardLimit;
	public static volatile SingularAttribute<LeaveMaster, Long> modifiedBy;
	public static volatile SingularAttribute<LeaveMaster, Long> id;
	public static volatile SingularAttribute<LeaveMaster, Long> validity;
	public static volatile SingularAttribute<LeaveMaster, Date> createdOn;
	public static volatile SingularAttribute<LeaveMaster, String> status;

}

