package com.example.case2.repository.customer;

import com.example.case2.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

    @Query(value = "select c from Customer c where c.status = 0 and c.customerName like %:name%")
    Page<Customer> findAll(Pageable pageable, @Param("name") String name);

    @Query(value = "select c from Customer c where c.status = 0")
    List<Customer> findAll();

    @Query(value = "select * from customer where customer_id = :id", nativeQuery = true)
    Customer findById(@Param("id") int id);

    @Modifying
    @Query(value = "update customer set status = 1 where customer_id = :id", nativeQuery = true)
    void delete(@Param("id") int id);

}


