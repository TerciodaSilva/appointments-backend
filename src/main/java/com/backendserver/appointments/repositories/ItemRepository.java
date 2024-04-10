package com.backendserver.appointments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendserver.appointments.Models.xml.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
  
}
