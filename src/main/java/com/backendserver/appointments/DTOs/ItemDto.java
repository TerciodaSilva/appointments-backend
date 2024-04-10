package com.backendserver.appointments.DTOs;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {
  
  private static final long serialVersionUID = 1L;

  private String name;
  private String time;
  private String price;
}
