package com.restapp.shop.repositories;

import com.restapp.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameLike(String name);
    List<Product> findAllByNameNotLike(String name);

    List<Product> findAllWhereNameContainsString(String name);
}