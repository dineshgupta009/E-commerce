package com.Ecommerce.Controller;

import com.Ecommerce.Entity.Order;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.OrderRepo;
import com.Ecommerce.Service.Interface.AddressService;
import com.Ecommerce.Service.Interface.OrderService;
import com.Ecommerce.Service.Interface.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    private OrderService orderService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.createUser(user);
//        addressService.createAddress(a);
        return ResponseEntity.ok("User Created ");
//        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @GetMapping("/orderByEmail")
    public ResponseEntity<List<Order>> createUser(@RequestParam String email) {
//        List<Order> order = userService.getUserFromEmailId(email);
        return ResponseEntity.ok(orderService.getOrdersByUserEmail(email));
    }

}
