package com.example.virtual_book_store.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="books")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NonNull
    @Column(name="title" , nullable = false)
    private String title;

    @NonNull
    @Column(name = "author",nullable = false)
    private String author;

    @NonNull
    @Column(name = "price", nullable= false)
    private BigDecimal price;

    @NonNull
    @Column(name = "description", nullable= false)
    private String description;

    @NonNull
    @Column(name = "isbn", nullable= false)
    private String isbn;

    @NonNull
    @Column(name = "publicationDate", nullable= false)
    private LocalDate publicationDate;



}
