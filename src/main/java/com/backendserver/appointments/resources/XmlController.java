package com.backendserver.appointments.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendserver.appointments.DTOs.AppointmentDto;
import com.backendserver.appointments.Models.xml.Appointments;
import com.backendserver.appointments.Models.xml.Components;
import com.backendserver.appointments.Models.xml.Item;
import com.backendserver.appointments.Models.xml.Style;
import com.backendserver.appointments.services.AppointmentService;
import com.backendserver.appointments.services.ComponentService;
import com.backendserver.appointments.services.ItemService;

@RestController
@RequestMapping(value = "/xml", produces="application/xml")
public class XmlController {

  @Autowired
  AppointmentService appointmentService;

  @Autowired
  ComponentService componentService;

  @Autowired
  ItemService itemService;

  @PostMapping
  public ResponseEntity<Appointments> receiveAppontmens(@RequestBody AppointmentDto appointmentDto) {
      Appointments appointment = new Appointments();
      appointment.setComponents(appointmentDto.getComponents());
      appointment.setStyle(appointmentDto.getStyle());
      System.out.println(appointment);
      return ResponseEntity.ok().body(appointment);
  }
  
  
  @GetMapping
  public ResponseEntity<Appointments> getFile() {
    Item item1 = new Item();
    item1.setName("consulta");
    item1.setTime("30");
    item1.setPrice("59");

    Item item1Insert = itemService.createItem(item1);

    Item item2 = new Item();
    item2.setName("consulta");
    item2.setTime("30");
    item2.setPrice("60");

    Item item2Insert = itemService.createItem(item2);

    Style style = Style.builder().build();
    Components components = new Components();
    
    components.getItems().add(item1Insert);
    components.getItems().add(item2Insert);

    Components componentInsert = componentService.createComponent(components);

    System.out.println(componentInsert);

    Appointments appointments = Appointments.builder().components(componentInsert).style(style).build();

    Appointments appointmentInsert = appointmentService.createAppointment(appointments);

    return ResponseEntity.ok().body(appointmentInsert);
  }
}
