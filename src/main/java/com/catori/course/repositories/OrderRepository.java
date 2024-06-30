package com.catori.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catori.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
