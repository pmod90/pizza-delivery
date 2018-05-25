package com.aquent.pizzadelivery.services.impl;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.aquent.pizzadelivery.dao.Order;

public class DeliveryReportGeneratorPlainText {

	public void generateReport(List<Order> orderList) {
		FileWriter writer;
		try {
			writer = new FileWriter(
					"/Users/harsh/pizza-delivery-main/pizza-delivery/src/main/resources/output.txt");
			for (Order str : orderList) {
				writer.write("The order " + str.getFood() + " was placed at : " + " ");
				writer.write(str.getTime().toString());
				writer.write(System.getProperty("line.separator"));
			}
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
