package com.carde.carde.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carde.carde.entity.Auto;
import com.carde.carde.model.Response;
import com.carde.carde.service.AutoService;

import io.swagger.annotations.ApiOperation;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/autos")
public class AutoController {

	@Autowired
	AutoService autoService;

	@PostMapping(value = "/agregar")
	@ApiOperation(value = "registro de nuevo auto", notes = "registro de nuevo auto")
	public Response<Object> agregar(@Valid @RequestBody Auto instance) {
		return autoService.autoguardar(instance);

	}

	@GetMapping(value = "/lista")
	@ApiOperation(value = "lista de autos", notes = "lista de auto")
	public Response<Object> lista() {
		return autoService.buscar();

	}

}
