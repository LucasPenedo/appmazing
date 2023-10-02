package com.campusdual.appmazing.Modelo.DTO.ProductMapper;

import com.campusdual.appmazing.Modelo.Categoria;
import com.campusdual.appmazing.Modelo.Contactos;
import com.campusdual.appmazing.Modelo.DTO.ContactosDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ContactosMapper {

    ContactosMapper INSTANCE = Mappers.getMapper(ContactosMapper.class);

    ContactosDTO toDTO (Contactos contactos);
    List<ContactosDTO> toDTOList(List<Contactos> contactos);

    Contactos toEntity(ContactosDTO contactosDTO);

}
