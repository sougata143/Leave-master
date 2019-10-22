package com.sougata.leave.repository.repositoryimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.HolidayMaster;
import com.sougata.leave.repository.customrepository.HolidayCustomRepository;

@Repository
public class HolidayRepositoryImpl implements HolidayCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(HolidayMaster holidayMaster) {

	entityManager.merge(holidayMaster);
    }

    @Override
    public void deleteHoliday(Long id) {
	entityManager.remove(getById(id));

    }

    @Override
    public HolidayMaster getById(Long id) {
	return entityManager.find(HolidayMaster.class, id);
    }

}
