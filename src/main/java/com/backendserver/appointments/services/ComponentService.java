package com.backendserver.appointments.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendserver.appointments.Models.xml.Components;
import com.backendserver.appointments.repositories.ComponentRepository;

@Service
public class ComponentService {
  
  @Autowired
  ComponentRepository componentRepository;

  public Components createComponent(Components component) {
    return componentRepository.save(component);
  }

  public Optional<Components> getComponent(Long id) {
    return componentRepository.findById(id);
  }

  public Components updateComponent(Long id, Components components) {
    Components component = componentRepository.getReferenceById(id);
    component.setItems(components.getItems());
    return componentRepository.save(component);
  } 
 
}
