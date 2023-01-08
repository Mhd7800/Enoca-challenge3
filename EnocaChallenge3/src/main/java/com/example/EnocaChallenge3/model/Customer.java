package com.example.EnocaChallenge3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    //@NotBlank(message = "Name must not be blank")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Column(name = "age")
    private int age;

    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name = "customer_id")
    private List<Order> orders;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Order> getOrders() {
        return orders;
    }

}
