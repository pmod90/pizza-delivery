package com.aquent.pizzadelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquent.pizzadelivery.dao.Order;
import com.aquent.pizzadelivery.services.DeliveryReportGenerator;
import com.aquent.pizzadelivery.services.OrderSerializer;
import com.aquent.pizzadelivery.utils.OrderSorter;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    OrderSerializer orderSerializer;
    
    @Autowired
    DeliveryReportGenerator deliveryReportGenerator;
    
    @Autowired
    OrderSorter orderSorter;

    @RequestMapping("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String home(@QueryParam("fileName") String fileName) {
    	List<Order> serializedOrder;
        try {
            serializedOrder = orderSerializer.serialize(fileName);
            Collections.sort(serializedOrder, orderSorter);
            System.out.println(serializedOrder);
            deliveryReportGenerator.generateReport(serializedOrder);
        } catch (IOException e) {
        	
        }
        return "Success!";
    }
}
