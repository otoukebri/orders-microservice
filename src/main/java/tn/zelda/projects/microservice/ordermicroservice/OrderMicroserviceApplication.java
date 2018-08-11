package tn.zelda.projects.microservice.ordermicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.zelda.projects.microservice.ordermicroservice.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.domains.Order;

@SpringBootApplication
public class OrderMicroserviceApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(OrderMicroserviceApplication.class);

	@Autowired
	OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OrderMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("OrderMicroservice command line runner!");
		orderRepository.save(new Order(5));
		orderRepository.save(new Order(6));
		log.info(orderRepository.findAll().toString());
	}
	
	@Bean
	CommandLineRunner  runner() {
		return args -> {
			System.out.println("CommandLineRunner running in the UnsplashApplication class...");
		};
	}
}
