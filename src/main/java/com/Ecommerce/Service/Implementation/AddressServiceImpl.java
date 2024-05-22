package com.Ecommerce.Service.Implementation;

import com.Ecommerce.Entity.Address;
import com.Ecommerce.Repository.AddressRepo;
import com.Ecommerce.Service.Interface.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;
    @Override
    public void createAddress(Address address) {

        addressRepo.save(address);
    }
}
