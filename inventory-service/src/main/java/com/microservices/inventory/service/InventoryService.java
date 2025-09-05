package com.microservices.inventory.service;

public interface InventoryService {
    public boolean isInStock(String skuCode, Integer quantity);
}
