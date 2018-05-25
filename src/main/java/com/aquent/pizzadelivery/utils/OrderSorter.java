package com.aquent.pizzadelivery.utils;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import com.aquent.pizzadelivery.dao.Order;

@Component
public class OrderSorter implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		return o1.getTime().compareTo(o2.getTime());
	}
}
