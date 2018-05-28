package com.aquent.pizzadelivery.dao;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.Date;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testSetOrderFoodName() {
		Order order = new Order();
		order.setFood("pizzzza");	
		assertTrue(order.getFood() == "pizzzza");
	}

	@Test
	public void testSetOrderTime() {
		Order order = new Order();
		Instant instant = Instant.now();
		Date orderDate = Date.from(instant);
		order.setTime(orderDate);
		assertTrue(order.getTime() == orderDate);
	}

}
