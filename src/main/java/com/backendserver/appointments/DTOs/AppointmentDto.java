package com.backendserver.appointments.DTOs;

import java.io.Serializable;

import com.backendserver.appointments.Models.xml.Components;
import com.backendserver.appointments.Models.xml.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto implements Serializable {
  private static final long serialVersionUID = 1L;

  private Components components;
  private Style style;

}
