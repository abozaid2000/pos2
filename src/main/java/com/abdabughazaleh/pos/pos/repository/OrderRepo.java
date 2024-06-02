package com.abdabughazaleh.pos.pos.repository;

import com.abdabughazaleh.pos.pos.entity.OrderEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
@Configuration
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
}
