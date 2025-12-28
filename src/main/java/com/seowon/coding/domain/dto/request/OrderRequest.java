package com.seowon.coding.domain.dto.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderRequest {
    
    private String customerName;
    private String customerEmail;
    private List<Long> productIds;
    private List<Integer> quantities;
}
