package com.Ecommerce.Service.Implementation;

import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.UserRepo;
import com.Ecommerce.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }
}
