package com.campusdual.appmazing.Service;

import com.campusdual.appmazing.API.IProductService;
import com.campusdual.appmazing.Modelo.DAO.ProductDao;
import com.campusdual.appmazing.Modelo.DTO.ProductDTO;
import com.campusdual.appmazing.Modelo.DTO.ProductMapper.ProductMapper;
import com.campusdual.appmazing.Modelo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
@Lazy
@Service("ProductService")
public class ProductService implements IProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDTO queryProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        Product productFinal = productDao.getReferenceById(product.getId());
        ProductDTO dto = ProductMapper.INSTANCE.toDTO(productFinal);
        return dto;
    }

    @Override
    public List<ProductDTO> queryAllProducts(ProductDTO productDTO) {
      return  ProductMapper.INSTANCE.toDTOList(this.productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        this.productDao.saveAndFlush(product);
        return product.getId();
    }

    @Override
    public int updateProduct(ProductDTO productDTO) {
        return this.insertProduct(productDTO);
    }

    @Override
    public int deleteProduct(ProductDTO productDTO) {
        int id = productDTO.getId();
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        productDao.delete(product);
        return id;
    }
}
