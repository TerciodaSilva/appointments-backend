package com.backendserver.appointments.Models.xml;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ColorModel {

  private String button;
  private String text;
  private String background;

}
