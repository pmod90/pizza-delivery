package com.aquent.pizzadelivery.services.impl;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.aquent.pizzadelivery.dao.Order;

public class DeliveryReportGeneratorPlainTextTest {

	@Test
	public void testNewFileCreation() throws IOException {
		List<Order> generatedOrders = generateOrders();

		DeliveryReportGeneratorPlainText deliveryReportGeneratorPlainText = new DeliveryReportGeneratorPlainText();
		deliveryReportGeneratorPlainText.generateReport(generatedOrders);

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("output.txt").getFile());
		final Path path = file.toPath();
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			line = reader.readLine();
			assertEquals(line, "The order food1 was placed at " + ":  Sat Jan 17 20:24:51 CST 1970");
		}
	}

	private List<Order> generateOrders() {
		List<Order> orderList = new ArrayList<Order>();
		Date date1 = new Date();
		date1.setTime(1477232687);
		Order order1 = new Order();
		order1.setFood("food1");
		order1.setTime(date1);
		orderList.add(order1);

		Date date2 = new Date();
		date1.setTime(1477491887);
		Order order2 = new Order();
		order2.setFood("food2");
		order2.setTime(date2);
		orderList.add(order2);

		return orderList;
	}
}
