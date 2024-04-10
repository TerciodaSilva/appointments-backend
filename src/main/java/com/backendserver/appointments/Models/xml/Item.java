package com.backendserver.appointments.Models.xml;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.backendserver.appointments.DTOs.ItemDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb-item")
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
  
  @Id
  @JsonIgnore
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToMany
  @JsonIgnore
  private Set<Components> component = new HashSet<>();
  
  private String name;
  private String time;
  private String price;

  public Item (ItemDto itemDto) {
    this.setName(itemDto.getName());
    this.setTime(itemDto.getTime());
    this.setPrice(itemDto.getPrice());
  }

}
