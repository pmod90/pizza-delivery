package com.aquent.pizzadelivery.utils;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.aquent.pizzadelivery.dao.Order;

public class OrderSorterTest {

	private final Long epoch1 = 1477232687L;
	private final Long epoch2 = 1477491887L;
	private final OrderSorter orderSorter = new OrderSorter();

	@Test
	public void testEqual() {
		Order order1 = new Order("food1", new Date(epoch1));
		Order order2 = new Order("food1", new Date(epoch1));
		int result = orderSorter.compare(order1, order2);
		assertTrue("expected to be equal", result == 0);
	}
	
	@Test
	public void testGreaterThan() {
		Order order1 = new Order("food2", new Date(epoch2));
		Order order2 = new Order("food1", new Date(epoch1));
		int result = orderSorter.compare(order1, order2);
		assertTrue("expected to be equal", result >= 1);
	}
	
	@Test
	public void testLessThan() {
		Order order1 = new Order("food1", new Date(epoch1));
		Order order2 = new Order("food2", new Date(epoch2));
		int result = orderSorter.compare(order1, order2);
		assertTrue("expected to be equal", result <= -1);
	}
}
