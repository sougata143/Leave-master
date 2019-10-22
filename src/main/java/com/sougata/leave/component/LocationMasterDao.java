package com.sougata.leave.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sougata.leave.entity.LocationMaster;
import com.sougata.leave.repository.LocationMasterRepository;

@Component
public class LocationMasterDao {

    @Autowired
    LocationMasterRepository locationMasterRepository;

    @Autowired
    UserDao userDao;

    public LocationMaster findById(Long locationId) {
	return locationMasterRepository.getById(locationId);
    }

}
