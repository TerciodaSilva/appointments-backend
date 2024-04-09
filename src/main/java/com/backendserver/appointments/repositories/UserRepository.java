package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.backendserver.appointments.Models.user.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{
  User findFirstUserByUsernameAndPassword(String username, String password);
}
