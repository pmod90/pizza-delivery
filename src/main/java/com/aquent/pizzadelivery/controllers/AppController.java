package com.aquent.pizzadelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquent.pizzadelivery.dao.Order;
import com.aquent.pizzadelivery.services.DeliveryReportGenerator;
import com.aquent.pizzadelivery.services.OrderSerializer;
import com.aquent.pizzadelivery.utils.OrderSorter;

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
    public String home() {
    	List<Order> serializedOrder;
        try {
            serializedOrder = orderSerializer.serialize();
            Collections.sort(serializedOrder, orderSorter);
            System.out.println(serializedOrder);
            deliveryReportGenerator.generateReport(serializedOrder);
        } catch (IOException e) {
        	
        }
        return "Success!";
    }
}
