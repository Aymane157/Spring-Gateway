package com.gateway.project.productsservice;

import com.gateway.project.productsservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(101L, "Asus Pro", new BigDecimal("9000dh"),false),
                new Product(102L, "Souris", new BigDecimal("30dh"),true),
                new Product(103L, "Casque Gamer", new BigDecimal("100dh"),false)
        );
    }
}
