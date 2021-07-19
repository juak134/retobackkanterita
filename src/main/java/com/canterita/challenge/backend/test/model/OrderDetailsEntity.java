package com.canterita.challenge.backend.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity(name = "ORDER_DETAILS_ENTITY")
public class OrderDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "id_order")
	private Long idOrder;
	
	@Column(name = "detail")
	private String detail;
	
	@Column(name = "cantidad")
	private Double cantidad;

	@Column(name = "precio_unitario")
	private Double precioUnitario;
	
	@Column(name = "total_detail")
	private Double totalDetail;

	public Long getId() {
		return id;
	}
	
	public Long getIdOrder() {
		return idOrder;
	}

	public String getDetail() {
		return detail;
	}
	
	public Double getCantidad() {
		return cantidad;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	
	public Double getTotalDetail() {
		return totalDetail;
	}


}
