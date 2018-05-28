package com.aquent.pizzadelivery.services.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aquent.pizzadelivery.dao.Order;
import com.aquent.pizzadelivery.services.DeliveryReportGenerator;

@Component
public class DeliveryReportGeneratorPlainText implements DeliveryReportGenerator {

	public void generateReport(List<Order> orderList) {
		FileWriter writer;
		try {
			File file = new File("src/main/resources/output.txt");

			// Create the file
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

			writer = new FileWriter(file);

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
