package com.felipe.totalorder.order;

import com.felipe.totalorder.order.entities.Order;
import com.felipe.totalorder.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
	}
}
