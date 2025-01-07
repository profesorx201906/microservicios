package com.unir.bookingmicroservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.unir.bookingmicroservice.dto.ProductDTO;

@Service
public class ProductsService {
    @Autowired
    RestTemplate restTemplate;

    public List<ProductDTO> getProducts() {
        ResponseEntity<ProductDTO[]> response = restTemplate.getForEntity(
                "http://localhost:8080/api/products",
                ProductDTO[].class);
        ProductDTO[] productDTO = response.getBody();
        List<ProductDTO> m = Arrays.asList(productDTO);
        return m;

    }
}

