package com.aquent.pizzadelivery;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.aquent.pizzadelivery.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderSerializerFromFile implements OrderSerializer {
    @Override
    public void serialize() throws IOException {
        final Path path = Paths.get("/Users/parthmody/Desktop/pizza-delivery/src/main/resources/input.txt");
        System.out.println(path.toAbsolutePath().toString());

        List<Order> orderList = new ArrayList<Order>();


        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("\\s+");
                if (!StringUtils.isEmpty(row[0]) && !StringUtils.isEmpty(row[1])) {

                    Order order = new Order();
                    order.setFood(row[0]);
                    order.setTime(row[1]);
                    orderList.add(order);

                }

            }
        }
        System.out.println(orderList);
    }
}
