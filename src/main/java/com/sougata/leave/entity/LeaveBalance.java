package com.sougata.leave.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LEAVE_BALANCE_DETAILS")
public class LeaveBalance implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "BALANCE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LEAVE_TYPE_ID")
    private LeaveMaster leaveMaster;

    @Column(name = "OPENING_BALANCE")
    private Long openingBalance;

    @Column(name = "LEAVE_EARNED")
    private Long leaveEarned;

    @Column(name = "TOTAL_LEAVE")
    private Long totalLeave;

    @Column(name = "LEAVE_APPLIED")
    private Long leaveApplied;

    @Column(name = "LEAVE_LAPSED")
    private Long leaveLapsed;

    @Column(name = "LEAVE_BALANCE")
    private Long leaveBalance;
    
    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LOCATION_ID")
    private LocationMaster locationMaster;

    @Column(name = "VALID_FROM")
    private Date validFrom;

    @Column(name = "VALID_TO")
    private Date validTo;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_ON")
    private Date createdOn;

    @Column(name = "MOD_BY")
    private Long modifiedBy;

    @Column(name = "MOD_ON")
    private Date modifiedOn;

    public LeaveBalance() {
	super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LeaveMaster getLeaveMaster() {
        return leaveMaster;
    }

    public void setLeaveMaster(LeaveMaster leaveMaster) {
        this.leaveMaster = leaveMaster;
    }

    public Long getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(Long openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Long getLeaveEarned() {
        return leaveEarned;
    }

    public void setLeaveEarned(Long leaveEarned) {
        this.leaveEarned = leaveEarned;
    }

    public Long getTotalLeave() {
        return totalLeave;
    }

    public void setTotalLeave(Long totalLeave) {
        this.totalLeave = totalLeave;
    }

    public Long getLeaveApplied() {
        return leaveApplied;
    }

    public void setLeaveApplied(Long leaveApplied) {
        this.leaveApplied = leaveApplied;
    }

    public Long getLeaveLapsed() {
        return leaveLapsed;
    }

    public void setLeaveLapsed(Long leaveLapsed) {
        this.leaveLapsed = leaveLapsed;
    }

    public Long getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(Long leaveBalance) {
        this.leaveBalance = leaveBalance;
    }


    public LocationMaster getLocationMaster() {
        return locationMaster;
    }

    public void setLocationMaster(LocationMaster locationMaster) {
        this.locationMaster = locationMaster;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
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
	return "LeaveBalance [id=" + id + ", user=" + user + ", leaveMaster=" + leaveMaster + ", openingBalance="
		+ openingBalance + ", leaveEarned=" + leaveEarned + ", totalLeave=" + totalLeave + ", leaveApplied="
		+ leaveApplied + ", leaveLapsed=" + leaveLapsed + ", leaveBalance=" + leaveBalance + ", locationMaster="
		+ locationMaster + ", validFrom=" + validFrom + ", validTo=" + validTo + ", createdBy=" + createdBy
		+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
    }



}
