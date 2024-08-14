package com.example.virtual_book_store.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.virtual_book_store.entities.Book;

public interface BookRepository extends CrudRepository<Book,Long>{
    
}
