package com.aquent.pizzadelivery.services.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.aquent.pizzadelivery.dao.Order;
import com.aquent.pizzadelivery.services.OrderSerializer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Component
public class OrderSerializerFromFile implements OrderSerializer {
	@Override
	public List<Order> serialize() throws IOException {

<<<<<<< Updated upstream
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("input.txt").getFile());
		final Path path = file.toPath();
		System.out.println(path);
=======
		final Path path = Paths.get("/Users/parthmody/Desktop/pizza-delivery/src/main/resources/input.txt");
		System.out.println(path.toAbsolutePath().toString());
>>>>>>> Stashed changes

		List<Order> orderList = new ArrayList<>();

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			int counter = 0;
			while ((line = reader.readLine()) != null) {
				String[] row = line.split("\\s+");
				if (!StringUtils.isEmpty(row[0]) && !StringUtils.isEmpty(row[1])) {
					counter++;
					Order order = new Order();
					order.setFood(row[0]);
					String string = row[1];
					if (counter == 1) {
						continue;
					}
					Long longDate = Long.parseLong(string);
					Date date = new Date(longDate);
					order.setTime(date);
					orderList.add(order);
				}
			}
		}
		return orderList;
	}
}
