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
@Table(name = "HOLIDAY_MASTER")
public class HolidayMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "HOLIDAY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "HOLIDAY")
    private Date holidayDate;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "HOLIDAY_TYPE")
    private String holidayType;

    @Column(name = "HOLIDAY_YEAR")
    private Long holidayYear;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "LOCATION_ID")
    private LocationMaster locationMaster;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_ON")
    private Date createdOn;

    @Column(name = "MOD_BY")
    private Long modifiedBy;

    @Column(name = "MOD_ON")
    private Date modifiedOn;

    public HolidayMaster() {
	super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public LocationMaster getLocationMaster() {
	return locationMaster;
    }

    public void setLocationMaster(LocationMaster locationMaster) {
	this.locationMaster = locationMaster;
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

    public Date getHolidayDate() {
	return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
	this.holidayDate = holidayDate;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getHolidayType() {
	return holidayType;
    }

    public void setHolidayType(String holidayType) {
	this.holidayType = holidayType;
    }

    public Long getHolidayYear() {
	return holidayYear;
    }

    public void setHolidayYear(Long holidayYear) {
	this.holidayYear = holidayYear;
    }

    @Override
    public String toString() {
	return "HolidayMaster [id=" + id + ", holidayDate=" + holidayDate + ", description=" + description
		+ ", holidayType=" + holidayType + ", holidayYear=" + holidayYear + ", locationMaster=" + locationMaster
		+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
		+ ", modifiedOn=" + modifiedOn + "]";
    }

}
