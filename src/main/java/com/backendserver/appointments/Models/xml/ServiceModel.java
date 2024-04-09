package com.backendserver.appointments.Models.xml;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceModel {
  private ArrayList<ItemModel> items = new ArrayList<>();
}
