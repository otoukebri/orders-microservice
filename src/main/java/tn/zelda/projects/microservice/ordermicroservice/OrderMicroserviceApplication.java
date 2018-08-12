package tn.zelda.projects.microservice.ordermicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.zelda.projects.microservice.ordermicroservice.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.dao.ProductRepository;
import tn.zelda.projects.microservice.ordermicroservice.domains.Order;
import tn.zelda.projects.microservice.ordermicroservice.domains.OrderDetail;
import tn.zelda.projects.microservice.ordermicroservice.domains.Product;

@SpringBootApplication
public class OrderMicroserviceApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(OrderMicroserviceApplication.class);

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
//	
	public static void main(String[] args) {
		SpringApplication.run(OrderMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("OrderMicroservice command line runner!");
		Product product = new Product();
		productRepository.save(product);
		product.getOrdersDetails().add(new OrderDetail(new Product("hello", 1.5f), new Order(5)));
		productRepository.save(product);
		productRepository.flush();
//		orderRepository.save(new Order(6));
//		log.info(orderRepository.findAll().toString());
	}
	
//	@Bean
//	CommandLineRunner  runner() {
//		return args -> {
//			System.out.println("CommandLineRunner running in the UnsplashApplication class...");
//		};
//	}
}
