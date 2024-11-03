package com.codegym.c0424m1cmsthymeleaf.service;

import com.codegym.c0424m1cmsthymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
