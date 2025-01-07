package com.unir.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unir.productservice.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
