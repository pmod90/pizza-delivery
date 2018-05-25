package com.aquent.pizzadelivery.services.impl;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aquent.pizzadelivery.dao.Order;
import com.aquent.pizzadelivery.services.DeliveryReportGenerator;
<<<<<<< Updated upstream
=======
import org.springframework.stereotype.Component;
>>>>>>> Stashed changes

@Component
public class DeliveryReportGeneratorPlainText implements DeliveryReportGenerator {

	public void generateReport(List<Order> orderList) {
		FileWriter writer;
		try {
<<<<<<< Updated upstream
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("file/test.output.xml").getFile());
			writer = new FileWriter(file);
=======
			writer = new FileWriter(
					"/Users/parthmody/Desktop/pizza-delivery/src/main/resources/output.txt");
>>>>>>> Stashed changes
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
