package com.backendserver.appointments.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendserver.appointments.Models.xml.Appointments;
import com.backendserver.appointments.repositories.AppointmentsRepository;

@Service
public class AppointmentService {
  
  @Autowired
  AppointmentsRepository appointmentsRepository;

  public Appointments createAppointment(Appointments appointment) {
    return appointmentsRepository.save(appointment);
  }


  public Optional<Appointments> getAppointment(Long id) {
    return appointmentsRepository.findById(id);
  }

  public Appointments updateAppointment(Long id, Appointments appointment) {
    Appointments appointmentReference = appointmentsRepository.getReferenceById(id);
    appointmentReference.setComponents(appointment.getComponents());
    appointmentReference.setStyle(appointment.getStyle());
    return appointmentsRepository.save(appointmentReference);
  }
 

}
