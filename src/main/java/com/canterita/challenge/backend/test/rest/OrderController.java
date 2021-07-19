package com.canterita.challenge.backend.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.service.IOrderService;


@RestController
//Recibirá las peticiones que tengan "orders" en su estructura
@RequestMapping("/orders")
//Parametros que permitirán que se acepten las peticiones que provienen de determinado puerto y se reciban el el puerto del servicio. En este caso el puerto 4200 de angular
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8888"})
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	//Se recibiran las peticiones tipo get con una variable que recibirá el id de la orden
	@GetMapping(value = "/{id}/details")
	//Anotación para manejar errores
	@ResponseStatus(HttpStatus.OK)
	public OrderDto getOrder(@PathVariable Long id) {
		//se retornará los datos que reciba de la función que realiza la busqueda
		return orderService.getOrder(id);
	}

}
