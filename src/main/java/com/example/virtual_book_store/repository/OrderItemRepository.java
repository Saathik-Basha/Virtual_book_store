package com.example.virtual_book_store.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.virtual_book_store.entities.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem,Long>{

}
