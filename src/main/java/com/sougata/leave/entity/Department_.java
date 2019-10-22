package com.sougata.leave.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static volatile SingularAttribute<Department, String> deptName;
	public static volatile SingularAttribute<Department, Organization> organization;
	public static volatile SingularAttribute<Department, Long> id;

}

