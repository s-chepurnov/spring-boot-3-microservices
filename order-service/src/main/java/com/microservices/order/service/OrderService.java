package com.microservices.order.service;

import com.microservices.order.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
