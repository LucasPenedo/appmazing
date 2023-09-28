package com.campusdual.appmazing.Controller;

import com.campusdual.appmazing.API.IProductService;
import com.campusdual.appmazing.Modelo.DTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
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
      public ProductDTO queryProduct(@RequestBody ProductDTO product){
        return this.productService.queryProduct(product);
    }
    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts(){
        return this.productService.queryAllProducts();
    }
@PostMapping(value = "/add")
    public int insertProduct(@RequestBody ProductDTO product){
        return this.productService.insertProduct(product);
    }
    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDTO product){
        return this.productService.updateProduct(product);
    }
    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDTO product){
        return this.productService.deleteProduct(product);
    }
}
