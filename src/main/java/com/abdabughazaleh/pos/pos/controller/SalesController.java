package com.abdabughazaleh.pos.pos.controller;

import com.abdabughazaleh.pos.pos.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/sales")
@RestController
public class SalesController {
    @Autowired
    private SaleDao saleDao;
}
