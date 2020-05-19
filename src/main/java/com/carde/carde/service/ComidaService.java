package com.carde.carde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carde.carde.entity.Comida;
import com.carde.carde.model.Response;
import com.carde.carde.repository.ComidaRepository;
import com.carde.carde.util.CardeUtils;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ComidaService {

	@Autowired
	ComidaRepository comidaRepository;

	public Response<Object> comidaGuardar(Comida instance) {

		Response<Object> response = new Response<Object>();
		try {
			Comida comida = new Comida();
			comida.setLugar(instance.getLugar());
			comida.setPrecio(instance.getPrecio());
			comida.setRestaurant(instance.getRestaurant());
			
			comidaRepository.save(comida);
			
			response.setResultset(comida);

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;
	}
}
