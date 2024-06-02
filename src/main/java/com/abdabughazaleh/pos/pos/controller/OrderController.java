package com.abdabughazaleh.pos.pos.controller;

import com.abdabughazaleh.pos.pos.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderDao orderDao;
}
