package com.canterita.challenge.backend.test.service;


import java.util.List;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

public interface IOrderDetailsService {
	//Definición de la funcion que  retornará los detalles de las ordenes 
	public List<OrderDetailsDto> getOrderDetails(Long id);
	//Definición de la funcion que guardará los datos de detalle de la orden
    public void saveOrUpdate( OrderDetailsEntity details );
    
    
}
