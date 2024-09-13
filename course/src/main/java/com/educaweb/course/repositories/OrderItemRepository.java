package com.educaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.course.entities.OrderItem;
import com.educaweb.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
