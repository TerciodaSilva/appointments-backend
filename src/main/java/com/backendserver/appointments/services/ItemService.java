package com.backendserver.appointments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backendserver.appointments.Models.xml.Item;
import com.backendserver.appointments.repositories.ItemRepository;

@Service
public class ItemService {
  
  @Autowired
  ItemRepository itemRepository;

  public Item createItem(Item item) {
    return itemRepository.save(item);    
  }

  public Item getItem (Long id){
    return itemRepository.getReferenceById(id);
  }

}
