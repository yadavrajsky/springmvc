package com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
