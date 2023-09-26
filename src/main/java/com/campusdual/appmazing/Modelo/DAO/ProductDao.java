package com.campusdual.appmazing.Modelo.DAO;

import com.campusdual.appmazing.Modelo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
