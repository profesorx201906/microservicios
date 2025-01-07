package com.unir.productservice.repository;

import com.unir.productservice.entity.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Categories, String> {

}
