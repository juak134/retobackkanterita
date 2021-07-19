package com.canterita.challenge.backend.test.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class OrderDto {

	public OrderDto(Long id2, String number2, String client2, Double total2, LocalDateTime dateOrder2) {
		setId(id2);
		setNumber(number2);
		setClient(client2);
		setTotal(total2);
		setDateOrder(dateOrder2);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDateTime getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(LocalDateTime dateOrder) {
		this.dateOrder = dateOrder;
	}

	private Long id;
	
	private String number;

	private String client;
	
	private Double total;

	private LocalDateTime dateOrder;
	
}
