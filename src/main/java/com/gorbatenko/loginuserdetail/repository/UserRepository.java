package com.gorbatenko.loginuserdetail.repository;

import com.gorbatenko.loginuserdetail.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
