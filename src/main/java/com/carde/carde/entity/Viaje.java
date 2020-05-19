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
@Table(name = "viaje")
public class Viaje implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1209733354059897360L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private Long idDias;
	private Date inicio;
	private Date fin;
	private String status;
	private BigDecimal presupuesto;
	
	
	
	
	

}
