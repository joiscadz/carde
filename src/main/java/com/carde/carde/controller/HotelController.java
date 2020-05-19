package com.carde.carde.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carde.carde.entity.Hotel;
import com.carde.carde.model.Response;
import com.carde.carde.service.HotelService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@PostMapping(value = "/agregarHotel")
	@ApiOperation(value = "registro de hotel", notes = "registro de hotel")
	public Response<Object> agregarHotel(@Valid @RequestBody Hotel instance) {
		return hotelService.hotelguardar(instance);
	}

}
