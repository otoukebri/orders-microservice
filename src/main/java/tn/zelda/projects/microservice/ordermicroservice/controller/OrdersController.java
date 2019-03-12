package tn.zelda.projects.microservice.ordermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import tn.zelda.projects.microservice.ordermicroservice.dao.ProductRepository;
import tn.zelda.projects.microservice.ordermicroservice.domain.Product;

@RestController
public class OrdersController {

    private ProductRepository productRepository;

    @Autowired
    public OrdersController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @RequestMapping("/orders")
//    public Flux<Product> getAllOrder() {
//
//        productRepository.findAll()
//        //return productRepository.findAll();
//    }

}
