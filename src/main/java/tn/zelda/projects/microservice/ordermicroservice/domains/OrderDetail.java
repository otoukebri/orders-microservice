package tn.zelda.projects.microservice.ordermicroservice.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Table(name = "orderdetail")
@Entity
@IdClass(OrderDetail.class)
public class OrderDetail implements Serializable {
	
//	@EmbeddedId
//	private OrderDetailId orderDetailId;
	
	@Id
	@GeneratedValue
	private Long id;	
	
	@Column(name = "created_on")
    private Date createdOn = new Date();
	
	@Column
	private int quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("productId")
	private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("orderId")
	private Order order;

	public OrderDetail() {
		this.product =  new Product();
		this.order =  new Order();
	}
	
	public OrderDetail(Product product, Order order) {
		this.product = product;
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

//	public OrderDetailId getOrderDetailId() {
//		return orderDetailId;
//	}
//
//	public void setOrderDetailId(OrderDetailId orderDetailId) {
//		this.orderDetailId = orderDetailId;
//	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

}
