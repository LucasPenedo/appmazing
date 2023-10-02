package com.campusdual.appmazing.Modelo.DTO.ProductMapper;

import com.campusdual.appmazing.Modelo.Categoria;
import com.campusdual.appmazing.Modelo.DTO.CategoriaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {
    CategoriaMapper INSTANCE= Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO toDTO (Categoria categoria);

    List<CategoriaDTO> toDTOList (List<Categoria> categoria);

   Categoria toEntity (CategoriaDTO categoriaDTO);


}
