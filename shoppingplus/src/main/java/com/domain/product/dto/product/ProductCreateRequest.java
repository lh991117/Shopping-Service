package com.domain.product.dto.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;

public record ProductCreateRequest(
    @NotNull Long categoryId,
    @NotBlank String name,
    @NotNull @Positive BigDecimal price,
    @NotNull @Min(0) Integer stock,
    String decString
) {}