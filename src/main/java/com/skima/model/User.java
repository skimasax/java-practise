package com.skima.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private int Id;
    private String name;
    private String email;
    private String address;

    public User(int id, String name, String email, String address) {
        Id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public User() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id == user.Id && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, email, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
