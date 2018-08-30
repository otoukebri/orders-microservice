package tn.zelda.projects.microservice.ordermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.zelda.projects.microservice.ordermicroservice.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
