package com.Ecommerce.Service.Interface;

import com.Ecommerce.Entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrdersByUserEmail(String email);
}
