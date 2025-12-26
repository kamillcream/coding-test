package com.seowon.coding.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderInfoVO {
    private Long productId;
    private Integer quantity;
}
