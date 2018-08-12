package tn.zelda.projects.microservice.ordermicroservice.domains;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "orders")
@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orderId")
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date orderDate;
	
	@Column
	private double amount;
	
	@Column
	private int orderNum;
	
	@Column
	private String customerAddress;
	
	@Column
	private String customerEmail;
	
	@OneToMany(mappedBy = "order")
//	@JoinColumn(name = "orderId")
	private Set<OrderDetail> ordersDetails = new HashSet<OrderDetail>();

	public Order() {
		this.ordersDetails = new HashSet<OrderDetail>();
	}

	public Order(double amount) {
		this.amount = amount;
//		this.ordersDetails = new HashSet<OrderDetail>();
	}

	@Override
	public String toString() {
		return String.format("{id: %s, amount }", id, amount);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Set<OrderDetail> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(Set<OrderDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

}
