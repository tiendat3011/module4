package com.example.case2.service.employee.impl;

import com.example.case2.model.employee.Position;
import com.example.case2.repository.employee.PositionRepository;
import com.example.case2.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
