package com.example.case4.service.customer;

import com.example.case4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable, String name);

    void create(Customer customer);

    void delete(int id);

    void findAll();

    Customer findById(int id);

//    void update(String customerCode,
//                String customerName,
//                String customerBirthday,
//                int customerGender,
//                String customerIdCard,
//                String customerPhone,
//                String customerEmail,
//                String customerAddress,
//                int customerType,
//                int id);
    void update(Customer customer);
}
