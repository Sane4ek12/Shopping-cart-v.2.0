package com.example.demo.repository;

import com.example.demo.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findAllByOrderId(long orderId);
}
