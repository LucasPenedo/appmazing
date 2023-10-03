package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.ICategoryService;
import com.campusdual.appmazing.model.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String testContactsController() {
        return "Category controller works!";
    }

    @PostMapping(value = "/get")
    public CategoryDTO queryCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.queryCategory(categoryDTO);
    }

    @GetMapping(value = "/getAll")
    public List<CategoryDTO> queryAllCategories(){
        return categoryService.queryAllCategory();
    }

    @PostMapping(value = "/add")
    public int insertCategory(@RequestBody CategoryDTO category){
        return this.categoryService.insertCategory(category);
    }

    @PutMapping(value = "/update")
    public int updateCategory(@RequestBody CategoryDTO category){
        return this.categoryService.updateCategory(category);
    }

    @DeleteMapping(value = "/add")
    public int deleteCategory(@RequestBody CategoryDTO category){
        return this.categoryService.deleteCategory(category);
    }

}
