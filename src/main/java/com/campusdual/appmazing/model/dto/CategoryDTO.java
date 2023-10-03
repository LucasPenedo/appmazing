package com.campusdual.appmazing.model.dto;

import com.campusdual.appmazing.model.Product;

import java.util.List;

public class CategoryDTO {

    private int id;

    private String name;

    public int getId() {
        return this.id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
