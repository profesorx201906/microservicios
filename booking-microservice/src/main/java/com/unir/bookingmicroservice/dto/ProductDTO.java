package com.unir.bookingmicroservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
}


