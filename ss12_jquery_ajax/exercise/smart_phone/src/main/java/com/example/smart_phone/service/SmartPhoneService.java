package com.example.smart_phone.service;

import com.example.smart_phone.model.SmartPhone;

import java.util.Optional;

public interface SmartPhoneService {
    Iterable<SmartPhone> findAll();

    Optional<SmartPhone> findById(Long id);

    SmartPhone save(SmartPhone smartPhone);

    void remove(Long id);
}
