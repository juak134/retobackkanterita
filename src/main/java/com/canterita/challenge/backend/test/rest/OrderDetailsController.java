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
//Recibirá las peticiones que tengan "details" en su estructura
@RequestMapping("/details")
//Parametros que permitirán que se acepten las peticiones que provienen de determinado puerto y se reciban el el puerto del servicio. En este caso el puerto 4200 de angular
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8888"})
public class OrderDetailsController {
	
	@Autowired
	private IOrderDetailsService orderDetailsService;
	//Se recibiran las peticiones tipo get con una variable que recibirá el id de la orden como idOrder
	@GetMapping(value = "/{id}/details")
	@ResponseStatus(HttpStatus.OK)
	public List<OrderDetailsDto> getOrderDetails(@PathVariable Long id) {
		return orderDetailsService.getOrderDetails(id);
	}
	//Se recibiran las peticiones tipo post con una Json con los datos que serán guardados
	@RequestMapping(value = "/", method = RequestMethod.POST)
	//anotación el valor devuelto del método constituirá el cuerpo de la respuesta HTTP
	@ResponseBody
	//@RequestBody se puede usar para transmitir todos los datos json en el cuerpo al backend, y luego el backend los analizará.
    public Long details(  @RequestBody  OrderDetailsEntity details) {
		//Llamada a la función que guarda los datos pasando estos por parametro
        orderDetailsService.saveOrUpdate( details );
        //Retorno del id de el registro almacenado para validación en el front
        return details.getId();
    }


}
