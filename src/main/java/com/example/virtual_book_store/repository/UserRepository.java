package com.example.virtual_book_store.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.virtual_book_store.entities.User;

public interface UserRepository extends CrudRepository<User,Long>{

    
}