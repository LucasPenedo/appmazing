package com.campusdual.appmazing.Controller;

import com.campusdual.appmazing.API.ICategoriaService;
import com.campusdual.appmazing.API.IContactosService;
import com.campusdual.appmazing.Modelo.DTO.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    ICategoriaService categoriaService;

    @GetMapping
    public String testController(){
        return "Categoria controller works";
    }
    @PostMapping
    public String testController(@RequestBody String body){
        return "Categoria controller works, " + body;
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Metodo correcto";
    }
    @PostMapping(value = "/get")
    public CategoriaDTO queryCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.queryCategoria(categoria);
    }
    @GetMapping(value = "/getAll")
    public List<CategoriaDTO> queryAllContactos(){
        return this.categoriaService.queryAllProducts();
    }
    @PostMapping(value = "/add")
    public int insertCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.insertCategoria(categoria);
    }
    @PutMapping(value = "/update")
    public int updateCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.updateCategoria(categoria);
    }
    @DeleteMapping(value = "/delete")
    public int deleteCategoria(@RequestBody CategoriaDTO categoria){
        return this.categoriaService.deleteCategoria(categoria);
    }
}
