package com.example.virtual_book_store.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.virtual_book_store.entities.Order;

public interface OrderRepository extends CrudRepository<Order,Long>{

    
} 