package com.Ecommerce.Controller;

import com.Ecommerce.Service.Interface.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;
}
