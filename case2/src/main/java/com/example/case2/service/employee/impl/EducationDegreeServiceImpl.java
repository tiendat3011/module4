package com.example.case2.service.employee.impl;

import com.example.case2.model.employee.EducationDegree;
import com.example.case2.repository.employee.EducationDegreeRepository;
import com.example.case2.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
