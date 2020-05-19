package com.carde.carde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carde.carde.entity.Viaje;
import com.carde.carde.model.Response;
import com.carde.carde.repository.ViajeRepository;
import com.carde.carde.util.CardeUtils;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ViajeService {
	
	@Autowired
	ViajeRepository viajeRepository;

	public  Response<Object> autoguardar(Viaje instance) {
	

		Response<Object> response = new Response<Object>();
		try {
			
			Viaje viaje = new Viaje();
			
			viaje.setInicio(instance.getInicio());
			viaje.setPresupuesto(instance.getPresupuesto());
			viaje.setStatus(instance.getStatus());
			viaje.setFin(instance.getFin());
			
			
			viajeRepository.save(viaje);
			response.setResultset(viaje);

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;
		
		
	}
	
	
	
}
