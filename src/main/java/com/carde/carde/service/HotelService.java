package com.carde.carde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carde.carde.entity.Hotel;
import com.carde.carde.model.Response;
import com.carde.carde.repository.HotelRepository;
import com.carde.carde.util.CardeUtils;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class HotelService {

	@Autowired
	HotelRepository hotelRepository;

	public Response<Object> hotelguardar(Hotel instance) {

		Response<Object> response = new Response<Object>();
		try {
		 Hotel hotel = new Hotel();
		 hotel.setNombre(instance.getNombre());
		 hotel.setLugar(instance.getLugar());
		 hotel.setPrecio(instance.getPrecio());
		 hotel.setHabitaciones(instance.getHabitaciones());
		 
		 hotelRepository.save(hotel);
		 
		 response.setResultset(hotel);
		 

		} catch (Exception e) {
			log.error(e.toString(), e);
			CardeUtils.catchResponse(response, e);
		}

		return response;
	}
}
