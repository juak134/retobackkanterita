package com.canterita.challenge.backend.test.service;


import java.util.List;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

public interface IOrderDetailsService {
	
	public List<OrderDetailsDto> getOrderDetails(Long id);
	
    public void saveOrUpdate( OrderDetailsEntity details );
    
    
}
