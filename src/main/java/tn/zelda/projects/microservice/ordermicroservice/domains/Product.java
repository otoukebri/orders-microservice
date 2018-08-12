package tn.zelda.projects.microservice.ordermicroservice.domains;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="products")
@Entity
public class Product {

	@Id 
	@GeneratedValue
	@Column(name="productId")
	private long id;
	@Column
	private String code;
	@Column
	private String label;
	@Column
	private float price;
	
	@OneToMany
	(mappedBy = "product")
//	@JoinColumn(name = "productId")
	private Set<OrderDetail> ordersDetails = new HashSet<OrderDetail>() ;

	
	public Product() {
//		this.ordersDetails = new HashSet<OrderDetail>();
	}
	
	
	
	public Product(String label, float price) {
		this.label = label;
		this.price = price;
//		this.ordersDetails = new HashSet<OrderDetail>();
	}

	public Product(long id, String label, float price) {
		this.id = id;
		this.label = label;
		this.price = price;
//		this.ordersDetails = new HashSet<OrderDetail>();
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<OrderDetail> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(Set<OrderDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	
}