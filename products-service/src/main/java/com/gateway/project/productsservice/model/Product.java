package com.gateway.project.productsservice.model;

import java.math.BigDecimal;

public record Product(Long id, String name, BigDecimal price,boolean availability) {}