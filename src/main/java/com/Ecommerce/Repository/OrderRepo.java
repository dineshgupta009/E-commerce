package com.Ecommerce.Repository;

import com.Ecommerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {

    @Query("SELECT o FROM Order o WHERE o.user.email = :email")
    List<Order> findOrdersByUserEmail(@Param("email") String email);
}
