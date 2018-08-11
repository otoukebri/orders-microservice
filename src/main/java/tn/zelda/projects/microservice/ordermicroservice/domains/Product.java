package tn.zelda.projects.microservice.ordermicroservice.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="products")
@Entity
public class Product {

	@Id @GeneratedValue
	private long id;
	@Column
	private String code;
	@Column
	private String label;
	@Column
	private float price;

	public Product(String label, float price) {
		this.label = label;
		this.price = price;
	}

	public Product(long id, String label, float price) {
		this.id = id;
		this.label = label;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}