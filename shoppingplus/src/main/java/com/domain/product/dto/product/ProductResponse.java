package com.domain.product.dto.product;

import java.math.BigDecimal;

public record ProductResponse(
    Long id,
    Long categoryId,
    String name,
    BigDecimal price,
    Integer stock,
    String description
) {}
