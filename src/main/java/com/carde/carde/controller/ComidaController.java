package com.carde.carde.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carde.carde.entity.Comida;
import com.carde.carde.model.Response;
import com.carde.carde.service.ComidaService;

import io.swagger.annotations.ApiOperation;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/comida")
public class ComidaController {
	
	@Autowired
	ComidaService comidaService;
	
	@PostMapping(value = "/agregarComida")
	@ApiOperation(value = "registro de comida", notes = "registro de comida")
	public Response<Object> agregar(@Valid @RequestBody Comida instance) {
		return comidaService.comidaGuardar(instance);
	}

}
