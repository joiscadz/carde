package com.carde.carde.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.carde.carde.entity.Combustible;
import com.carde.carde.model.Response;
import com.carde.carde.service.CombustibleService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/combustible")
public class CombustibleController {

	@Autowired
	CombustibleService combustibleService;

	@PostMapping(value = "/agregarCombustible")
	@ApiOperation(value = "registro de combustible", notes = "registro de combustible")
	public Response<Object> agregar(@Valid @RequestBody Combustible instance) {
		return combustibleService.guardarCombustible(instance);
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "avance consulta")
	public @ResponseBody Response<Object> lista(@RequestParam Long idAuto) {
		return combustibleService.listaCombustible(idAuto);
	}
	

}
