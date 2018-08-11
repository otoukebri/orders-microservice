package tn.zelda.projects.microservice.ordermicroservice.domains;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="orderdetail")
@Entity
public class OrderDetail {

	@Id	@GeneratedValue
	private String id;
	
	private int quantity;
	
	@OneToMany
	private Set<Product> products;
	
	public OrderDetail() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
