package com.sougata.leave.repository.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sougata.leave.entity.User;
import com.sougata.leave.repository.customrepository.UserCustomRepository;

@Transactional
@Repository
public class UserRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(Long userId) {
	return entityManager.find(User.class, userId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() {
	String hql = "FROM User as user ORDER BY user.id";
	return (List<User>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addUser(User user) {
	entityManager.merge(user);
	
    }

    @Override
    public void updateUser(User user) {
	User userItem = entityManager.find(User.class, user.getId());
	userItem.setAlternateEmail(user.getAlternateEmail());
	userItem.setCity(user.getCity());
	userItem.setCountry(user.getCountry());
	userItem.setDateOfBirth(user.getDateOfBirth());
	userItem.setDepartment(user.getDepartment());
	userItem.setDesignation(user.getDesignation());
	userItem.setEmail(user.getEmail());
	userItem.setEndDate(user.getEndDate());
	userItem.setFatherName(user.getFatherName());
	userItem.setFromDate(user.getFromDate());
	userItem.setGender(user.getGender());
	userItem.setIsEnabled(user.getIsEnabled());
	userItem.setLastName(user.getLastName());
	userItem.setMobile(user.getMobile());
	userItem.setModifiedBy(user.getModifiedBy());
	userItem.setModifiedOn(user.getModifiedOn());
	userItem.setOrganization(user.getOrganization());
	userItem.setPassport(user.getPassport());
	userItem.setPermAddr(user.getPermAddr());
	userItem.setSpouseName(user.getSpouseName());
	userItem.setState(user.getState());
	userItem.setTypeOfEmployment(user.getTypeOfEmployment());
	userItem.setZip(user.getZip());
	userItem.setId(user.getId());
	entityManager.merge(userItem);
	//entityManager.flush();
    }

    @Override
    public void deleteUser(Long userId) {
	entityManager.remove(getUserById(userId));
    }

    @Override
    public boolean userExists(String userName, String password) {
	String hql = "FROM User as user WHERE user.userName = ? and user.password = ?";
	int count = entityManager.createQuery(hql).setParameter(1, userName).setParameter(2, password).getResultList()
		.size();
	return count > 0 ? true : false;
    }

}
