package com.example.case2.service.service;

import com.example.case2.model.service.Service;
import com.example.case2.model.service.dto.ServiceDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    Page<Service> findAll (Pageable pageable);

    void create (ServiceDto serviceDto);

    List<Service> findAll ();

    void update (ServiceDto serviceDto);

    Service findById(int id);
}
