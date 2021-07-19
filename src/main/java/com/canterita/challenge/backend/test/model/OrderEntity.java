package com.canterita.challenge.backend.test.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity(name = "ORDER_ENTITY")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "client")
	private String client;

	@Column(name = "total")
	private Double total;
	
	@Column(name = "date_order")
	private LocalDateTime dateOrder;

	public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public String getClient() {
		return client;
	}

	public Double getTotal() {
		return total;
	}

	public LocalDateTime getDateOrder() {
		return dateOrder;
	}

}
