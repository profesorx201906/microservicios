package com.unir.bookingmicroservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.unir.bookingmicroservice.dto.OrderDTO;
import com.unir.bookingmicroservice.dto.ProductDTO;
import com.unir.bookingmicroservice.entity.Order;
import com.unir.bookingmicroservice.repository.OrderRepository;
import com.unir.bookingmicroservice.service.ProductsService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    ProductsService productsService;

    @GetMapping()
    public String getMethodName() {
        return "booking";
    }

    @PostMapping("/order")
    public String saveOrder(@RequestBody OrderDTO orderDTO) {

        return "Orden Guardada";

    }

    @GetMapping("/products")
    public List<ProductDTO> productos() {
        return productsService.getProducts();
    }

}
