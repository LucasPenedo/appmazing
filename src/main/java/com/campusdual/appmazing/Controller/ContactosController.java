package com.campusdual.appmazing.Controller;

import com.campusdual.appmazing.API.IContactosService;
import com.campusdual.appmazing.Modelo.DTO.ContactosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ContactosController {

    @Autowired
    IContactosService contactosService;

    @GetMapping
    public String testController(){
        return "Product controller works!";
    }
    @PostMapping
    public String testController(@RequestBody String body){
        return "Product controller works, " + body + "!";
    }
    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Metodo";
    }
    @PostMapping(value="/get")
    public ContactosDTO queryContactos(@RequestBody ContactosDTO contactos){
        return this.contactosService.queryContactos(contactos);
    }
    @GetMapping(value = "/getAll")
    public List<ContactosDTO> queryAllContactos(){
        return this.contactosService.queryAllContactos();
    }
    @PostMapping(value = "/add")
    public int insertContactos(@RequestBody ContactosDTO contactos){
        return this.contactosService.insertContactos(contactos);
    }
    @PutMapping(value = "/update")
    public int updateContactos(@RequestBody ContactosDTO contactos){
        return this.contactosService.updateContactos(contactos);
    }
    @DeleteMapping(value = "/delete")
    public int deleteContactos(@RequestBody ContactosDTO contactos){
        return this.contactosService.deleteContactos(contactos);
    }
}
