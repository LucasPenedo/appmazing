package com.campusdual.appmazing.Service;

import com.campusdual.appmazing.API.ICategoriaService;
import com.campusdual.appmazing.Modelo.Categoria;
import com.campusdual.appmazing.Modelo.DAO.CategoriaDao;
import com.campusdual.appmazing.Modelo.DTO.CategoriaDTO;
import com.campusdual.appmazing.Modelo.DTO.ProductMapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Lazy
@Service("CategoriaService")
public class CategoriaService implements ICategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public CategoriaDTO queryCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        Categoria categoriaF = categoriaDao.getReferenceById(categoria.getId());
        CategoriaDTO dto = CategoriaMapper.INSTANCE.toDTO(categoriaF);
        return dto;
    }

    @Override
    public List<CategoriaDTO> queryAllProducts() {
        return CategoriaMapper.INSTANCE.toDTOList(this.categoriaDao.findAll());
    }

    @Override
    public int insertCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        this.categoriaDao.saveAndFlush(categoria);
        return categoria.getId();
    }

    @Override
    public int updateCategoria(CategoriaDTO categoriaDTO) {
        return this.insertCategoria(categoriaDTO);
    }

    @Override
    public int deleteCategoria(CategoriaDTO categoriaDTO) {
        int id = categoriaDTO.getId();
        Categoria categoria = CategoriaMapper.INSTANCE.toEntity(categoriaDTO);
        categoriaDao.delete(categoria);
        return 0;
    }
}
