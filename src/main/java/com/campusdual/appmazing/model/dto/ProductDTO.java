package com.campusdual.appmazing.model.dto;

import com.campusdual.appmazing.model.Category;
import com.campusdual.appmazing.model.dto.CategoryDTO;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDTO {

    private int id;

    private String name;

    private int stock;

    private BigDecimal price;

    private boolean active;

    private Date date_added;

    private CategoryDTO category;

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

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDate_added() {
        return this.date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public CategoryDTO getCategory() {
        return this.category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }
}
