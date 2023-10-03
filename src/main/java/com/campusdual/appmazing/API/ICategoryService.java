package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {

    //CRUD Operations
    CategoryDTO queryCategory(CategoryDTO categoryDTO);
    List<CategoryDTO> queryAllCategory();
    int insertCategory(CategoryDTO categoryDTO);
    int updateCategory(CategoryDTO categoryDTO);
    int deleteCategory(CategoryDTO categoryDTO);
}