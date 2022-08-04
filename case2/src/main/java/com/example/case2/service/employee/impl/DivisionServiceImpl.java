package com.example.case2.service.employee.impl;

import com.example.case2.model.employee.Division;
import com.example.case2.repository.employee.DivisionRepository;
import com.example.case2.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
