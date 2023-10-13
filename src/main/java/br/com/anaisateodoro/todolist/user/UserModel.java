package br.com.anaisateodoro.todolist.user;

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

    @Column(name = "usuario")
    public String username;
    public String name;
    public String password;

    // Pause
    @CreationTimestamp
    private localDateTime createdAt;

}
