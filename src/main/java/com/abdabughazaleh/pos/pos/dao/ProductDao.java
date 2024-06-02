package com.abdabughazaleh.pos.pos.dao;

import com.abdabughazaleh.pos.pos.entity.ProductEntity;
import com.abdabughazaleh.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
    @Autowired
    private ProductRepo productRepo;
  public ProductEntity addProduct(ProductEntity product){
      return this.productRepo.save(product);

  }

}
