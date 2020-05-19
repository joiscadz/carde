package com.carde.carde.service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carde.carde.entity.Combustible;
import com.carde.carde.exceptios.CardeExceptions;
import com.carde.carde.model.Response;
import com.carde.carde.repository.CombustibleRepository;
import com.carde.carde.util.CardeUtils;
import com.carde.carde.util.Constantes;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class CombustibleService {

	@Autowired
	CombustibleRepository combustibleRepository;

	public Response<Object> guardarCombustible(Combustible instance) {

		Response<Object> response = new Response<Object>();

		try {

			Combustible combustible = new Combustible();
			combustible.setFecha(new Date());
			combustible.setKilometros(instance.getKilometros());
			combustible.setCosto(instance.getCosto());
			combustible.setLitros(instance.getLitros());
			combustible.setPrecio(instance.getPrecio());
			combustible.setNotas(instance.getNotas());
			combustible.setIdAuto(instance.getIdAuto());

			combustibleRepository.save(combustible);

			response.setResultset(combustible);

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;

	}

	public Response<Object> listaCombustible(Long idAuto) {

		Response<Object> response = new Response<Object>();

		try {

			List<Combustible> listaCombustible = combustibleRepository.findByIdAuto(idAuto);

			if (listaCombustible.isEmpty() || Objects.isNull(listaCombustible)) {
				throw new CardeExceptions(Constantes.MENSAJE_ERROR_LISTA_AUTO, Constantes.CODIGO_ERROR_PROCESO);
			}
			response.setResultset(listaCombustible);

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;

	}

}
