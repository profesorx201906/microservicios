package com.unir.productservice.controller;

import com.unir.productservice.entity.Categories;
import com.unir.productservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")

public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/hola")
    public String saludar()
    {
      return "hola";
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Categories> getAllProducts() {
        return categoryRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody Categories product) {
        categoryRepository.save(product);
        return "ok";
    }

}
