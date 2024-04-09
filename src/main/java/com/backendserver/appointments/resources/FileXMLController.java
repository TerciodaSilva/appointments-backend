package com.backendserver.appointments.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendserver.appointments.Models.xml.AgendamentoModel;
import com.backendserver.appointments.Models.xml.ColorModel;
import com.backendserver.appointments.Models.xml.ItemModel;
import com.backendserver.appointments.Models.xml.ModelXML;
import com.backendserver.appointments.Models.xml.ServiceModel;
import com.backendserver.appointments.Models.xml.StyleModel;

@RestController
@RequestMapping(value = "/xml", produces = "application/xml")
@CrossOrigin
public class FileXMLController {
  
  @GetMapping
  public ResponseEntity<ModelXML> getFile() {

    AgendamentoModel agendamentoModel = new AgendamentoModel();
    ColorModel colorModel = new ColorModel();
    StyleModel styleModel = StyleModel.builder().colorModel(colorModel).build();

    ItemModel item1 = ItemModel.builder()
    .nome("Consulta")
    .tempo(30.0)
    .valor(20.0)
    .build();

    ItemModel item2 = ItemModel.builder()
    .nome("Consulta")
    .tempo(30.0)
    .valor(20.0)
    .build();

    ServiceModel serviceModel = new ServiceModel();
    serviceModel.getItems().add(item1);
    serviceModel.getItems().add(item2);
    agendamentoModel.setStylesModel(styleModel);
    agendamentoModel.setServiceModel(serviceModel);
    
    ModelXML model = ModelXML.builder().Agendamento(agendamentoModel).build();
    return ResponseEntity.ok().body(model);
  }

}
