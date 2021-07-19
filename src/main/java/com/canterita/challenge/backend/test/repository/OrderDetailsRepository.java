package com.canterita.challenge.backend.test.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long> {
	
	List<OrderDetailsEntity> findByIdOrder(Long idOrder);
	
}
