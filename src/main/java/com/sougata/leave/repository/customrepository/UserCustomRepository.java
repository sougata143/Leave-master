package com.sougata.leave.repository.customrepository;

import java.util.List;

import com.sougata.leave.entity.User;

public interface UserCustomRepository {

    User getUserById(Long userId);

    boolean userExists(String userName, String password);

    void deleteUser(Long userId);

    void updateUser(User user);

    void addUser(User user);

    List<User> getAllUsers();

}
