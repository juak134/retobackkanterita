package com.canterita.challenge.backend.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
//Permite devolver la información de las entidades cuando se realiza una realiza una petición
public class OrderDetailsDto {
	
	public OrderDetailsDto(Long idD, Long idOrderR, String detailL, Double cantidadD, Double precioUnitarioO, Double totalDetailL) {
		setId(idD);
		setOrder(idOrderR);
		setDetail(detailL);
		setCantidad(cantidadD);
		setPrecioUnitario(precioUnitarioO);
		setTotal(totalDetailL);
	}
	
	//Funciones que permiten que el servicio reconozca que debe devolvr los valores como respuesta de la solicitud
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdOrder() {
		return idOrder;
	}

	public void setOrder(Long idOrder) {
		this.idOrder = idOrder;
	}


	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Double getTotalDetail() {
		return totalDetail;
	}

	public void setTotal(Double totalDetail) {
		this.totalDetail = totalDetail;
	}


	private Long id;
	
	private Long idOrder;

	private String detail;
	
	private Double cantidad;

	private Double precioUnitario;

	private Double totalDetail;

	
}
