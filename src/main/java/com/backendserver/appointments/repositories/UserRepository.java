package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendserver.appointments.Models.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
  User findFirstUserByUsernameAndPassword(String username, String password);
}
