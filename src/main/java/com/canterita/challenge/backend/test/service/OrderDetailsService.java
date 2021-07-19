package com.canterita.challenge.backend.test.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.repository.OrderDetailsRepository;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

@Service
public class OrderDetailsService implements IOrderDetailsService{
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	//Función que guardará los registros de los detalles de las ordenes
    public void saveOrUpdate( OrderDetailsEntity details ) {
    	orderDetailsRepository.save( details );
    }

    //Función que retorna los detalles de la orden por el campo idOrder
    @Override
    //Función tipo List para poder retornar más de un registro de tipo dto
	public List<OrderDetailsDto> getOrderDetails(Long idOrder) {
    	//Variable tipo Lista dto para retornar los registros
		List<OrderDetailsDto> allDetails = new ArrayList<OrderDetailsDto>();
		//For para recorrer cada registro devuelto y agregarlo a la variable que retornará
		for( OrderDetailsEntity orderDetails : orderDetailsRepository.findByIdOrder(idOrder)){
			 //Utilizando las funciones en el dto se obtienen cada campo de los registros a retornar
			 OrderDetailsDto detail = new OrderDetailsDto(orderDetails.getId(), orderDetails.getIdOrder(), orderDetails.getDetail(), orderDetails.getCantidad(), orderDetails.getPrecioUnitario(), orderDetails.getTotalDetail());
			 allDetails.add(detail);
		}
		return allDetails;
	}
	

}
