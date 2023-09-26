package com.campusdual.appmazing.Modelo.DTO.ProductMapper;

import com.campusdual.appmazing.Modelo.DTO.ProductDTO;
import com.campusdual.appmazing.Modelo.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);
    List<ProductDTO> toDTOList(List<Product> products);

    Product toEntity(ProductDTO productDTO);
 }
