// UserDAO.java
package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springmvc.model.User;
import com.springmvc.repository.UserRepository;

@Repository
public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    public int saveUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser.getId(); // Assuming getId() returns the user's ID.
    }
}
