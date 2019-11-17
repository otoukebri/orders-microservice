package tn.zelda.projects.microservice.ordermicroservice.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.microservice.ordermicroservice.orders.repository.ProductRepository;

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
