package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendserver.appointments.Models.xml.Components;

public interface ComponentRepository extends JpaRepository<Components, Long> {
  
}
