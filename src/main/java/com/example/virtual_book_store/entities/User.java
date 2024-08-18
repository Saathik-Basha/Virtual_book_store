package com.example.virtual_book_store.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "username" , nullable = false , unique = true)
    private String username;

    @NonNull
    @Column(name = "password",nullable = false)
    private String password;

    @NonNull
    @Column(name = "role",nullable = false)
    private String role;
    
}
