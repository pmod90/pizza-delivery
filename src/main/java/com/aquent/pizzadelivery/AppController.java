package com.aquent.pizzadelivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AppController {

    @Autowired
    OrderSerializer orderSerializer;

    @RequestMapping("/")
    public String home() {
        try {
            orderSerializer.serialize();
        } catch (IOException e) {

        }
        return "Success!";
    }
}
