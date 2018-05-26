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

import java.io.File;
import java.net.URISyntaxException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PizzaDeliveryApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void testAppController() throws URISyntaxException {
		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/", String.class);
		assertThat(responseEntity.getStatusCode(),is(HttpStatus.OK));
		assertTrue((new File(getClass().getClassLoader().getResource("output.txt").toURI())).exists());

	}

}
