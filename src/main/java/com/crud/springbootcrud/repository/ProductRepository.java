package com.crud.springbootcrud.repository;

import com.crud.springbootcrud.produit.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
        Product findByName(String name);
        }
