package com.aquent.pizzadelivery.services;

import java.io.IOException;
import java.util.List;

import com.aquent.pizzadelivery.dao.Order;

public interface OrderSerializer {

    public List<Order> serialize(String fileName) throws IOException;
}
