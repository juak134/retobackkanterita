package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDto;

public interface IOrderService {
	//Definición de la funcion para obtener la irden
	public OrderDto getOrder(Long id);

}
