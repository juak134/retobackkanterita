package com.canterita.challenge.backend.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.repository.OrderRepository;

@Service
public class OrderService implements IOrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	//Función que retorna el registro de la orden utilizando el id como campo de comparación 
	public OrderDto getOrder(Long id) {
		return orderRepository.findById(id)
				//si se encuentra un registro con el id del parametro se crea una variable tipo dto con los datos de la orden
				.map(order -> new OrderDto(order.getId(), order.getNumber(), order.getClient(), order.getTotal(), order.getDateOrder()))
				.orElse(null);
	}

}
