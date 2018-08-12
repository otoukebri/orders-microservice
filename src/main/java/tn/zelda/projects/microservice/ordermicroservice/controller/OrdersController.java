package tn.zelda.projects.microservice.ordermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.zelda.projects.microservice.ordermicroservice.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.domains.Order;

@RestController(value="/api/v1")
public class OrdersController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@RequestMapping("/orders")
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
}
