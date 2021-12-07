package com.example.demo.modAdmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="predial")
public class Predial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_predial")
	private Long idPredial;
	
	@Column(nullable=false, unique=true)
	private String codigo;

	public Long getIdPredial() {
		return idPredial;
	}

	public void setIdPredial(Long idPredial) {
		this.idPredial = idPredial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
