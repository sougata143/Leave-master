package com.sougata.leave.dto;

import java.io.Serializable;
import java.sql.Date;

public class LeaveMasterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String leaveType;

    private char isCarryForward;

    private Long maxNumInAYear;

    private Long carryForwardLimit;

    private Long validity;

    private String status;

    private Long createdBy;

    private Date createdOn;

    private Long modifiedBy;

    private Date modifiedOn;
    
    private long userId;
    
    private Date startDate;
    
    private Date endDate;
    
    private String dayType;
    
    

    public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LeaveMasterDTO() {
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
