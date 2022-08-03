package com.example.case2.repository.service;

import com.example.case2.model.service.ServiceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ServiceTypeRepository extends PagingAndSortingRepository<ServiceType, Integer> {

    @Query(value = "select s from ServiceType s")
    List<ServiceType> findAll ();
}
