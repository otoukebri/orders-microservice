package tn.zelda.projects.microservice.ordermicroservice.orders.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.zelda.projects.microservice.ordermicroservice.orders.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
