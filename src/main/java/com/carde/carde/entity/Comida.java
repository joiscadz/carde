package com.carde.carde.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "comida")
public class Comida implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7695367700055548861L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String restaurant;
	private String lugar;
	private BigDecimal precio;
	

}
