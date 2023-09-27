package com.campusdual.appmazing.API;

import com.campusdual.appmazing.Modelo.DTO.ContactosDTO;

import java.util.List;

public interface IContactosService {
    ContactosDTO queryContactos(ContactosDTO contactosDTO);

    List<ContactosDTO> queryAllContactos();
    int insertContactos(ContactosDTO contactosDTO);
    int updateContactos(ContactosDTO contactosDTO);
    int deleteContactos(ContactosDTO contactosDTO);
}
