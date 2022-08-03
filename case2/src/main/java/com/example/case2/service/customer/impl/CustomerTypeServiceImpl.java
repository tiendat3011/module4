package com.example.case2.service.customer.impl;

import com.example.case2.model.customer.CustomerType;
import com.example.case2.repository.customer.CustomerTypeRepository;
import com.example.case2.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
