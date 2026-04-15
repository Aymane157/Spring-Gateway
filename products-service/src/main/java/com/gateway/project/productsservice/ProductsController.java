package com.gateway.project.productsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {


    public record Product(Long id, String name, BigDecimal price) {}

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(101L, "Laptop Pro", new BigDecimal("1299.99")),
                new Product(102L, "Souris Sans Fil", new BigDecimal("29.90")),
                new Product(103L, "Clavier Meca", new BigDecimal("89.50"))
        );
    }
}
