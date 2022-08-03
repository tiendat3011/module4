package com.example.case2.service.customer;

import com.example.case2.model.customer.Customer;
import com.example.case2.model.customer.dto.CustomerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll (Pageable pageable, String name);

    Customer save (Customer customer);
    void delete(int id);

    List<Customer> findAll();
    Customer findById(int id);


}
