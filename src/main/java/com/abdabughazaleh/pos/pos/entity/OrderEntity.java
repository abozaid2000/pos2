package com.abdabughazaleh.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Configuration;


@Table(name = "orders")
@Data
@Entity
@Configuration
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "total")
    private Double total;

}
