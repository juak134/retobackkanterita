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

	
    public void saveOrUpdate( OrderDetailsEntity details ) {
    	orderDetailsRepository.save( details );
    }


    @Override
	public List<OrderDetailsDto> getOrderDetails(Long idOrder) {
		List<OrderDetailsDto> allDetails = new ArrayList<OrderDetailsDto>();
		for( OrderDetailsEntity orderDetails : orderDetailsRepository.findByIdOrder(idOrder)){
			 OrderDetailsDto detail = new OrderDetailsDto(orderDetails.getId(), orderDetails.getIdOrder(), orderDetails.getDetail(), orderDetails.getCantidad(), orderDetails.getPrecioUnitario(), orderDetails.getTotalDetail());
			 allDetails.add(detail);
		}
		return allDetails;
	}
	

}
