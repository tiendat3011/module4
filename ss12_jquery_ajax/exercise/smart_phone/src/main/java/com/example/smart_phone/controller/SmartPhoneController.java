package com.example.smart_phone.controller;


import com.example.smart_phone.model.SmartPhone;
import com.example.smart_phone.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartPhoneController {
    @Autowired
    private SmartPhoneService smartPhoneService;

    @PostMapping
    public ResponseEntity<SmartPhone> createSmartphone(@RequestBody SmartPhone smartphone) {
        return new ResponseEntity<>(smartPhoneService.save(smartphone), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<SmartPhone>> allPhones() {
        return new ResponseEntity<>(smartPhoneService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SmartPhone> deleteSmartphone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = smartPhoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartPhoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update")
    public ResponseEntity<Iterable<SmartPhone>> updateSmartphone(@RequestBody SmartPhone smartphone) {
        smartPhoneService.save(smartphone);
        return new ResponseEntity<>(smartPhoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SmartPhone> findById(@PathVariable Long id) {
        Optional<SmartPhone> smartphone = smartPhoneService.findById(id);

        if (!smartphone.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphone.get(), HttpStatus.OK);
    }
}
