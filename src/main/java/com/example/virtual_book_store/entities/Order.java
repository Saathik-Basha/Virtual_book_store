package com.example.virtual_book_store.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(optional=false)
    @NonNull
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "totalPrice",nullable = false)
    @NonNull
    private BigDecimal totalPrice;

    @Column(name = "orderDate",nullable = false)
    @NonNull
    private LocalDateTime orderDate;

    @JsonIgnore
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderItem> ordered_items;
    
}
