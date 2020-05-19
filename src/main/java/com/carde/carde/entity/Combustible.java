package com.carde.carde.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "combustible")
public class Combustible implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -988148642454192126L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "kilometros")
	private Integer kilometros;
	@Column(name = "costo")
	private BigDecimal costo;
	@Column(name = "litros")
	private Integer litros;
	@Column(name = "precio")
	private BigDecimal	precio;
	@Column(name = "notas")
	private String notas;
	@Column(name = "idAuto")
	private Long idAuto;
}
