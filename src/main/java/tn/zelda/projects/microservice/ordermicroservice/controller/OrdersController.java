package tn.zelda.projects.microservice.ordermicroservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.zelda.projects.microservice.ordermicroservice.domains.Order;

@RestController("/api/")
public class OrdersController {

	@RequestMapping("/orders")
	public List<Order> getOrders() {
		return null;
	}
}
