package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendserver.appointments.Models.xml.Style;

public interface StyleRepository extends JpaRepository<Style, Long>{
  
}
