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
@Table(name = "LEAVE_TRANSACTION_DETAILS")
public class LeaveTransaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "LEAVE_TRAN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LEAVE_TYPE_ID")
    private LeaveMaster leaveMaster;


    @Column(name = "APPLIED_ON")
    private Date appliedOn;
    
    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "APPLIED_BY")
    private User appliedBy;
    
    @Column(name = "APPROVED_ON")
    private Date approvedOn;
    
    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "APPROVED_BY")
    private User approvedBy;
    
    @Column(name = "LEAVE_START_DATE")
    private Date leaveStartDate;
    
    @Column(name = "CANCELED_ON")
    private Date canceledOn;
    
    @Column(name = "AVAILED_ON")
    private Date availedOn;
    
    @Column(name = "RAISED_ON")
    private Date raisedOn;
    
    @Column(name = "RAISED_FOR")
    private Date raisedFor;
    
    @Column(name = "LEAVE_END_DATE")
    private Date leaveEndDate;
    
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
    
    @Column(name = "LEAVE_NO")
    private Long leaveNo;

    public LeaveTransaction() {
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

    public Date getAppliedOn() {
        return appliedOn;
    }

    public void setAppliedOn(Date appliedOn) {
        this.appliedOn = appliedOn;
    }

    public User getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(User appliedBy) {
        this.appliedBy = appliedBy;
    }

    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(User approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    public Date getCanceledOn() {
        return canceledOn;
    }

    public void setCanceledOn(Date canceledOn) {
        this.canceledOn = canceledOn;
    }

    public Date getAvailedOn() {
        return availedOn;
    }

    public void setAvailedOn(Date availedOn) {
        this.availedOn = availedOn;
    }

    public Date getRaisedOn() {
        return raisedOn;
    }

    public void setRaisedOn(Date raisedOn) {
        this.raisedOn = raisedOn;
    }

    public Date getRaisedFor() {
        return raisedFor;
    }

    public void setRaisedFor(Date raisedFor) {
        this.raisedFor = raisedFor;
    }

    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getLeaveNo() {
        return leaveNo;
    }

    public void setLeaveNo(Long leaveNo) {
        this.leaveNo = leaveNo;
    }

    @Override
    public String toString() {
	return "LeaveTransaction [id=" + id + ", user=" + user + ", leaveMaster=" + leaveMaster + ", appliedOn="
		+ appliedOn + ", appliedBy=" + appliedBy + ", approvedOn=" + approvedOn + ", approvedBy=" + approvedBy
		+ ", leaveStartDate=" + leaveStartDate + ", canceledOn=" + canceledOn + ", availedOn=" + availedOn
		+ ", raisedOn=" + raisedOn + ", raisedFor=" + raisedFor + ", leaveEndDate=" + leaveEndDate + ", status="
		+ status + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
		+ ", modifiedOn=" + modifiedOn + ", leaveNo=" + leaveNo + "]";
    }
    
    




}
