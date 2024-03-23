package com.example.Spring_Test.lifecycle;

import jakarta.annotation.PostConstruct;

public class Employee {

    private int id;
    private String name;
    public String getName() {
        return name;
    }

    @PostConstruct
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @PostConstruct
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
