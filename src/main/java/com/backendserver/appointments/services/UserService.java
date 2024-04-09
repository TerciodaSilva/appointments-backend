package com.backendserver.appointments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendserver.appointments.repositories.UserRepository;
import com.backendserver.appointments.DTOs.UserDTO;
import com.backendserver.appointments.Models.user.User;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User addUser(UserDTO userDto){
    User user = User.builder()
    .username(userDto.getUsername())
    .password(userDto.getPassword())
    .build();

    return userRepository.save(user);
  }


  public User getUser(UserDTO userDto) {
    return userRepository.findFirstUserByUsernameAndPassword(userDto.getUsername(), userDto.getPassword());
  }


}
