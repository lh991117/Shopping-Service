package com.domain.order.dto.order;

import java.util.List;

import jakarta.validation.constraints.*;

public record OrderCreateRequest(
    @NotBlank String buyername,
    @Email String buyerEmail,
    @NotEmpty List<OrderItemRequest> items
) {}