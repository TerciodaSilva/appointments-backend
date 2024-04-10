package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendserver.appointments.Models.xml.Appointments;

public interface AppointmentsRepository extends JpaRepository<Appointments, Long>{
  
}
