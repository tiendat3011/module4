package com.example.smart_phone.repository;

import com.example.smart_phone.model.SmartPhone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartPhoneRepository extends PagingAndSortingRepository<SmartPhone, Long> {

}
