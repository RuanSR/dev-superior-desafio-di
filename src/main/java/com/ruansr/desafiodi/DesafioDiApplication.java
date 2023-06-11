package com.ruansr.desafiodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ruansr.desafiodi.models.Order;
import com.ruansr.desafiodi.services.OrderService;

@SpringBootApplication
public class DesafioDiApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioDiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var order = new Order(1034, 150.00, 20.00);
		var order2 = new Order(2282, 800.00, 10.00);
		var order3 = new Order(1309, 95.90, 0.00);

		System.out.println("--------------------------------------------");
		System.out.println("Pedido codigo: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		System.out.println("--------------------------------------------");

		System.out.println("Pedido codigo: " + order2.getCode());
		System.out.println("Valor total: " + orderService.total(order2));
		System.out.println("--------------------------------------------");

		System.out.println("Pedido codigo: " + order3.getCode());
		System.out.println("Valor total: " + orderService.total(order3));
		System.out.println("--------------------------------------------");
	}

}
