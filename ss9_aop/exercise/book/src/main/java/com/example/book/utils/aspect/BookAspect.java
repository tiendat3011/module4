package com.example.book.utils.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.example.book.controller.BookController.showReturn(..))")
    public void borrowBook(JoinPoint joinPoint) {
        String message = joinPoint.getSignature().getName();
        logger.info("Có sách đã đc trả: " + message);
    }

    @After("execution (* com.example.book.controller.BookController.borrow(..))")
    public void returnBook(JoinPoint joinPoint) {
        String message = joinPoint.getSignature().getName();
        logger.info("Có sách vừa đc mượn: " + message);
    }

}
