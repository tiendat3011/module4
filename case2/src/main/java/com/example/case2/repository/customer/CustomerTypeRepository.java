package com.example.case2.repository.customer;

import com.example.case2.model.customer.CustomerType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CustomerTypeRepository extends PagingAndSortingRepository<CustomerType, Integer> {
    @Query(value = "select c from CustomerType c")
    List<CustomerType> findAll();
}
