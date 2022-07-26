package com.example.book.service;

import com.example.book.model.OrderBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderBookService {
    Page<OrderBook> findAll(Pageable pageable);

    void create(String id, String codeBook);

    OrderBook findId(String id);

    void delete(String id);
}
