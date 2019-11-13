package tn.zelda.projects.microservice.ordermicroservice;

import java.util.Set;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

import tn.zelda.projects.microservice.ordermicroservice.orders.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.orders.dao.ProductRepository;
import tn.zelda.projects.microservice.ordermicroservice.orders.domain.Order;
import tn.zelda.projects.microservice.ordermicroservice.orders.domain.OrderDetail;
import tn.zelda.projects.microservice.ordermicroservice.orders.domain.Product;

import javax.annotation.PostConstruct;

@EntityScan(basePackageClasses = {
        OrderMicroserviceApplication.class,
        Jsr310JpaConverters.class
})
@SpringBootApplication
public class OrderMicroserviceApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(OrderMicroserviceApplication.class);

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrderMicroserviceApplication.class, args);
    }

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @Override
    public void run(String... args) throws Exception {

        log.debug("OrderMicroservice command line runner!");

        //init phase normally product should already exits in db
        Product product = new Product("Microservices", "ms_ebook", 50);
        productRepository.save(product);


        Order order = new Order();
        Set<OrderDetail> odSet = order.getOrdersDetails();
        System.out.println(odSet);
        odSet.add(new OrderDetail(product, order));
        try {
            orderRepository.save(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

            WebClient.create("http://localhost:8080").method(HttpMethod.GET).retrieve().bodyToMono(String.class);

            System.out.println("CommandLineRunner running in the UnsplashApplication class...");
        };
    }
}
