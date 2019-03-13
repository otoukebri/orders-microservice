package tn.zelda.projects.microservice.ordermicroservice.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.zelda.projects.microservice.ordermicroservice.OrderMicroserviceApplication;
import tn.zelda.projects.microservice.ordermicroservice.domain.Order;
import tn.zelda.projects.microservice.ordermicroservice.domain.OrderDetail;
import tn.zelda.projects.microservice.ordermicroservice.domain.Product;

import java.util.Set;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    static final Logger log = LoggerFactory.getLogger(OrderRepository.class);

//    public  default void saveOrder(Product product){
//
//        log.debug("OrderMicroservice command line runner!");
//
//
//        Order order = new Order();
//
//        Set<OrderDetail> odSet = order.getOrdersDetails();
//        System.out.println(odSet);
//        odSet.add(new OrderDetail(product, order));
//        try {
//            orderRepository.save(order);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
