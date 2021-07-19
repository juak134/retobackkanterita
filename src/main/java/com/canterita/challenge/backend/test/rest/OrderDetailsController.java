package com.canterita.challenge.backend.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.service.IOrderDetailsService;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

@RestController
@RequestMapping("/details")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8888"})
public class OrderDetailsController {
	
	@Autowired
	private IOrderDetailsService orderDetailsService;
	
	@GetMapping(value = "/{id}/details")
	@ResponseStatus(HttpStatus.OK)
	public List<OrderDetailsDto> getOrderDetails(@PathVariable Long id) {
		return orderDetailsService.getOrderDetails(id);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
    public Long details(  @RequestBody  OrderDetailsEntity details) {
        orderDetailsService.saveOrUpdate( details );
        return details.getId();
    }


}
