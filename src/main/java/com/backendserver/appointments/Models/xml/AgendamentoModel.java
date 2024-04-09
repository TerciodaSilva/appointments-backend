package com.backendserver.appointments.Models.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoModel {
  private StyleModel stylesModel;
  private ServiceModel serviceModel;
}
