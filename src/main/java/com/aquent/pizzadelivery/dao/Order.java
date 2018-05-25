package com.aquent.pizzadelivery.dao;

import java.util.Date;

public class Order {
    private String food;
    private Date time;

    @Override
    public String toString() {
        return "Order{" +
                "food='" + food + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Order()
    {

    }

    public Order(String food, Date time) {
        this.food = food;
        this.time = time;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}
