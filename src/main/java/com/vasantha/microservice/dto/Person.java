package com.vasantha.microservice.dto;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private static final long serialVersionUID=1L;

    private int id;

    private String firstName;

    private String lastName;

    private String city;

    private List<Order> orders;

    public Person() {
    }
/*
    public Person(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

 */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order addOrder(Order order){
        getOrders().add(order);
        order.setPerson(this);

        return order;
    }

    public Order removeOrder(Order order){
        getOrders().remove(order);
        order.setPerson(null);

        return order;
    }


}
