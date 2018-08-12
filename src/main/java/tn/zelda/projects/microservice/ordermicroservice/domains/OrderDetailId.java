package tn.zelda.projects.microservice.ordermicroservice.domains;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailId {

	@Column(name = "orderId")
	private Long orderId;

	@Column(name = "productId")
	private Long productId;

	public OrderDetailId() {
//
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
