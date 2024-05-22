package com.Ecommerce.Service.Implementation;

import com.Ecommerce.Entity.Order;
import com.Ecommerce.Repository.OrderRepo;
import com.Ecommerce.Service.Interface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getOrdersByUserEmail(String email) {
        return orderRepo.findOrdersByUserEmail(email);
    }
}
