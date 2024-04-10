package com.backendserver.appointments.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendserver.appointments.DTOs.UserDto;
import com.backendserver.appointments.Models.user.User;
import com.backendserver.appointments.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  UserService userService;
  
  @PostMapping(value = "/register")
  public ResponseEntity<User> registerUser(@RequestBody UserDto userDto) {
    User user = userService.addUser(userDto);
    return ResponseEntity.ok().body(user);
  }
  
  @GetMapping
  public ResponseEntity<User> selectUser(@RequestBody UserDto userDto) {
    User user = userService.getUser(userDto);
    return ResponseEntity.ok().body(user);
  }
 
}
