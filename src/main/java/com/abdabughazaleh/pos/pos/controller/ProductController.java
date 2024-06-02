package com.abdabughazaleh.pos.pos.controller;

import com.abdabughazaleh.pos.pos.dao.ProductDao;
import com.abdabughazaleh.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/products")
@RestController
public class ProductController {
    @Autowired
    private ProductDao productDao;


    @PostMapping("/add-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product){
        return this.productDao.addProduct(product);

    }


}
