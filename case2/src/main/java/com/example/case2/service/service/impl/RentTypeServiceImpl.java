package com.example.case2.service.service.impl;

import com.example.case2.model.service.RentType;
import com.example.case2.repository.service.RentTypeRepository;
import com.example.case2.service.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
