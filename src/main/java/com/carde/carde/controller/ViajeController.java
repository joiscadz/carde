package com.carde.carde.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carde.carde.entity.Viaje;
import com.carde.carde.model.Response;
import com.carde.carde.service.ViajeService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/viaje")
public class ViajeController {

	@Autowired
	ViajeService viajeService;

	@PostMapping(value = "/agregarViaje")
	@ApiOperation(value = "registro de viaje", notes = "registro de viaje")
	public Response<Object> agregar(@Valid @RequestBody Viaje instance) {
		return viajeService.autoguardar(instance);
	}

}
