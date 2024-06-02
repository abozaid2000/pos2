package com.abdabughazaleh.pos.pos.dao;

import com.abdabughazaleh.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service
@Repository
@Configuration

public class OrderDao {


    @Autowired
    private OrderRepo orderRepo;

}
