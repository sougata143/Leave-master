package com.sougata.leave.component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sougata.leave.entity.User;
import com.sougata.leave.repository.UserRepository;

@Component
public class UserDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<User> userList = new ArrayList<User>();
	for (User user : userRepository.findAll()) {
	    userList.add(user);

	}
	return userList;

    }

    @Transactional(readOnly = true)
    public User findByUserName(String userName) {
	return userRepository.findByUserName(userName).get(0);
    }

    @Transactional(readOnly = true)
    public User findUserById(Long id) {
	return userRepository.findById(id).get(0);
    }

    @Transactional(readOnly = true)
    public void findByUserNameStream(String userName) {
	try (Stream<User> stream = userRepository.findByUserNameReturnStream(userName)) {
	    stream.forEach(x -> {
		LOGGER.info("User : " + x);
	    });
	}

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(User user) {
	userRepository.addUser(user);
	LOGGER.info("User added successfully " + user.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(Long userId) {
	userRepository.deleteUser(userId);
	LOGGER.info("User with id " + userId + " deleted successfully ");
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(User user) {
	userRepository.updateUser(user);
	LOGGER.info("User added successfully " + user.toString());
    }
    
    
}
