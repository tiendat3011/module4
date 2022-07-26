package com.example.book.service;

import com.example.book.model.OrderBook;
import com.example.book.repository.OrderBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrderBookServiceImpl implements OrderBookService {

    @Autowired
    private OrderBookRepository orderBookRepository;

    @Override
    public Page<OrderBook> findAll(Pageable pageable) {
        return orderBookRepository.findAll(pageable);
    }

    @Override
    public void create(String id, String codeBook) {
        orderBookRepository.create(id, codeBook);
    }

    @Override
    public OrderBook findId(String id) {
        return orderBookRepository.findId(id);
    }

    @Override
    public void delete(String id) {
        orderBookRepository.delete(id);
    }
}