package com.example.case2.repository.service;

import com.example.case2.model.service.RentType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RentTypeRepository extends PagingAndSortingRepository<RentType,Integer> {

    @Query(value = "select r from RentType r")
    List<RentType> findAll ();
}
