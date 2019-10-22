package com.sougata.leave.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sougata.leave.entity.HolidayMaster;
import com.sougata.leave.entity.LocationMaster;
import com.sougata.leave.repository.customrepository.HolidayCustomRepository;

public interface HolidayRepository extends CrudRepository<HolidayMaster, Long>, HolidayCustomRepository {

    List<HolidayMaster> findAll();

    List<HolidayMaster> findById(Long id);

    List<HolidayMaster> findByHolidayDate(Date holidayDate);

    List<HolidayMaster> findByHolidayTypeAndHolidayYear(String holidayType,Long holidayYear);

    List<HolidayMaster> findByHolidayYear(Long holidayYear);

    List<HolidayMaster> findByLocationMasterAndHolidayYear(LocationMaster locationMaster, Long holidayYear);

    @SuppressWarnings("unchecked")
    HolidayMaster save(HolidayMaster leaveBalance);

}
