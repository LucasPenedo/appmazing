package com.campusdual.appmazing.API;

import com.campusdual.appmazing.Modelo.DTO.ProductDTO;

import java.util.List;

public interface IProductService {
     ProductDTO queryProduct (ProductDTO product);
     List<ProductDTO> queryAllProducts(ProductDTO product);

     int insertProduct(ProductDTO productDTO);
     int updateProduct(ProductDTO productDTO);
     int deleteProduct(ProductDTO productDTO);
}
