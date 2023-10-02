package com.campusdual.appmazing.API;

import com.campusdual.appmazing.Modelo.DTO.CategoriaDTO;

import java.util.List;

public interface ICategoriaService {

    CategoriaDTO queryCategoria(CategoriaDTO categoriaDTO);

    List<CategoriaDTO> queryAllProducts();

    int insertCategoria(CategoriaDTO categoriaDTO);
    int updateCategoria(CategoriaDTO categoriaDTO);
    int deleteCategoria(CategoriaDTO categoriaDTO);
}
