package com.example.case4.service.customer;

import com.example.case4.model.customer.Customer;
import com.example.case4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable, String name)    {
        return customerRepository.findAll(pageable, name);
    }

    @Override
    public void create(Customer customer) {
//        customerRepository.create(customerDto.getCustomerCode(),
//                customerDto.getCustomerName(),customerDto.getCustomerBirthday(),
//                customerDto.getCustomerGender(),customerDto.getCustomerIdCard(),
//                customerDto.getCustomerPhone(),  customerDto.getCustomerEmail(),
//                customerDto.getCustomerAddress(), customerDto.getCustomerTypeId().getCustomerTypeId());
//
//    }
    customerRepository.save(customer);
    }


    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

    @Override
    public void findAll() {
        customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

//    @Override
//    public void update(String customerCode,
//                       String customerName,
//                       String customerBirthday,
//                       int customerGender,
//                       String customerIdCard,
//                       String customerPhone,
//                       String customerEmail,
//                       String customerAddress,
//                       int customerType,
//                       int id) {
//        customerRepository.update(customerCode, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress, customerType, id);
//    }
}
