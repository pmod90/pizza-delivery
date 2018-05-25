package com.aquent.pizzadelivery;

public class Order {
    private String food;
    private String time;

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

    public Order(String food, String time) {
        this.food = food;
        this.time = time;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
