package com.Ecommerce.Service.Implementation;

import com.Ecommerce.Entity.Order;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.AddressRepo;
import com.Ecommerce.Repository.UserRepo;
import com.Ecommerce.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AddressRepo addressRepo;

    @Override
    public void createUser(User user) {

        userRepo.save(user);
//        addressRepo.save()
    }

//    @Override
//    public List<Order> getUserFromEmailId(String email) {
//        return userRepo.findByUser_Email(email);
//    }


}
