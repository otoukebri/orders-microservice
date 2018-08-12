package tn.zelda.projects.microservice.ordermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.zelda.projects.microservice.ordermicroservice.domains.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
