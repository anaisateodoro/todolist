package br.com.anaisateodoro.todolist.user;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique=true)
    public String username;
    public String name;
    public String password;

    // Quando dado gerado já tera a informação
    @CreationTimestamp
    private LocalDateTime createdAt;

}
