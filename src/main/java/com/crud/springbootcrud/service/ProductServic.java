package com.crud.springbootcrud.service;


import com.crud.springbootcrud.produit.Product;
import com.crud.springbootcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServic {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }


    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return  repository.findByName(name);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return " Product deleted";
    }

    public Product updateProduct(Product product){
        Product existiingProduct =repository.findById(product.getId()).orElse(null);
        existiingProduct.setName(product.getName());
        existiingProduct.setPrice(product.getPrice());
        existiingProduct.setQuantity(product.getQuantity());


        return repository.save(existiingProduct);
    }
}
