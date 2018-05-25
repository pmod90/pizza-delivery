package com.aquent.pizzadelivery.utils;

import java.util.Comparator;

import com.aquent.pizzadelivery.dao.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderSorter implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		return o1.getTime().compareTo(o2.getTime());
	}
}
