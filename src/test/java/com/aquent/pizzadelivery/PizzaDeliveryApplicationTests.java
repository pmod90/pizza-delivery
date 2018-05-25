package com.aquent.pizzadelivery;

import com.aquent.pizzadelivery.controllers.AppController;
import com.aquent.pizzadelivery.services.DeliveryReportGenerator;
import com.aquent.pizzadelivery.services.OrderSerializer;
import com.aquent.pizzadelivery.utils.OrderSorter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PizzaDeliveryApplicationTests {

//	@MockBean
//	OrderSerializer orderSerializer;
//
//	@MockBean
//	DeliveryReportGenerator deliveryReportGenerator;
//
//	@MockBean
//	OrderSorter orderSorter;
//
//	@MockBean
//	AppController appController;

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void integration() {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/", String.class);
		assertThat(responseEntity.getStatusCode(),is(HttpStatus.OK));




	}

}
