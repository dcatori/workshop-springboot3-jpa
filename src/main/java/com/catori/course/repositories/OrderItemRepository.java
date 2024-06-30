package com.catori.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catori.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
