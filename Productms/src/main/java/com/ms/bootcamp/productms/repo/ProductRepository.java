package com.ms.bootcamp.productms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ms.bootcamp.productms.model.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
