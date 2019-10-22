package com.sougata.leave.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEAVE_MASTER")
public class LeaveMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LEAVE_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "LEAVE_TYPE")
    private String leaveType;

    @Column(name = "IS_CARRY_FWD")
    private char isCarryForward;

    @Column(name = "MAX_NUM_IN_A_YEAR")
    private Long maxNumInAYear;

    @Column(name = "CARRY_FWD_LIMIT")
    private Long carryForwardLimit;

    @Column(name = "VALIDITY")
    private Long validity;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_ON")
    private Date createdOn;

    @Column(name = "MOD_BY")
    private Long modifiedBy;

    @Column(name = "MOD_ON")
    private Date modifiedOn;
    
    @Column(name="LOCATION_ID")
    private long locationId;

    public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public LeaveMaster() {
	super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getLeaveType() {
	return leaveType;
    }

    public void setLeaveType(String leaveType) {
	this.leaveType = leaveType;
    }

    public char getIsCarryForward() {
	return isCarryForward;
    }

    public void setIsCarryForward(char isCarryForward) {
	this.isCarryForward = isCarryForward;
    }

    public Long getMaxNumInAYear() {
	return maxNumInAYear;
    }

    public void setMaxNumInAYear(Long maxNumInAYear) {
	this.maxNumInAYear = maxNumInAYear;
    }

    public Long getCarryForwardLimit() {
	return carryForwardLimit;
    }

    public void setCarryForwardLimit(Long carryForwardLimit) {
	this.carryForwardLimit = carryForwardLimit;
    }

    public Long getValidity() {
	return validity;
    }

    public void setValidity(Long validity) {
	this.validity = validity;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public Long getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
	this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
	return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
    }

    public Long getModifiedBy() {
	return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
	this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
	return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
	this.modifiedOn = modifiedOn;
    }

    @Override
    public String toString() {
	return "LeaveMaster [id=" + id + ", leaveType=" + leaveType + ", isCarryForward=" + isCarryForward
		+ ", maxNumInAYear=" + maxNumInAYear + ", carryForwardLimit=" + carryForwardLimit + ", validity="
		+ validity + ", status=" + status + ", createdBy=" + createdBy + ", createdOn=" + createdOn
		+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
    }

}
