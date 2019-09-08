package com.springcloud.book.ch15_1_order_server.dao;

import com.springcloud.book.ch15_1_order_server.model.Order;
import com.springcloud.book.ch15_1_order_server.model.OrderStatus;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrderDao extends CrudRepository<Order, Long> {
    @Modifying
    @Query("UPDATE Order SET status = :status WHERE id = :id")
    @Transactional
    Integer updateOrder(@Param("id") Long id, @Param("status") OrderStatus status);
}
