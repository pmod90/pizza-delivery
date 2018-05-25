package com.aquent.pizzadelivery.services;

import java.util.List;

import com.aquent.pizzadelivery.dao.Order;

public interface DeliveryReportGenerator {

	public void generateReport(List<Order> orderList);
}
