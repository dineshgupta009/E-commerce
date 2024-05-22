package com.Ecommerce.Repository;

import com.Ecommerce.Entity.Order;
import com.Ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

//    List<Order> findByUser_Email(String email);
}
