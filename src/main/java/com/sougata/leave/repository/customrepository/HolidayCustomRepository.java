package com.sougata.leave.repository.customrepository;

import com.sougata.leave.entity.HolidayMaster;

public interface HolidayCustomRepository {

    public void add(HolidayMaster holidayMaster);

    public void deleteHoliday(Long id);

    HolidayMaster getById(Long id);

}
