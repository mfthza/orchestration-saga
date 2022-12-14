package com.service.domainPersistence.payload.inventory;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Data
public class InventoryResponse {
    private UUID productId;
    private Double productAmount;
    private Double productPrice;
    private String status;
}
