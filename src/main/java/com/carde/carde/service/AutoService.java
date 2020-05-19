package com.carde.carde.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carde.carde.entity.Auto;
import com.carde.carde.exceptios.CardeExceptions;
import com.carde.carde.model.Response;
import com.carde.carde.repository.AutoRepository;
import com.carde.carde.util.CardeUtils;
import com.carde.carde.util.Constantes;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class AutoService {

	@Autowired
	AutoRepository autoRepository;

	public  Response<Object> autoguardar(Auto instance) {
	

		Response<Object> response = new Response<Object>();
		try {

			Auto auto = new Auto();

			auto.setNombre(instance.getNombre());
			auto.setTanque(instance.getTanque());

			if (Objects.isNull(auto))
				throw new CardeExceptions(Constantes.MENSAJE_NULL_AUTO, Constantes.CODIGO_ERROR_PROCESO);

			Auto gurdar =autoRepository.save(auto);

			response.setResultset(gurdar);
			
			
		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;

	}

	public Response<Object> buscar() {

		Response<Object> response = new Response<Object>();
		try {

			autoRepository.findAll();

			response.setResultset(autoRepository.findAll());

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;

	}
}
