package com.example.demo.modAdmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tramite_estratificacion_socio_economica")
public class TramiteEstratificacionSocioEconomica {
	
	@Id
	@GeneratedValue
	private Long id_tramite;
	
	@Column(nullable = false, unique = true)
	private String documento;
	
	@Column(name="codigo_predial", unique=true, nullable=false)
	private String codigoPredial;
	
	@Column(unique=true)
	private String correo;
	
	private String numero;
	
	private String direccion;

	public Long getId_tramite() {
		return id_tramite;
	}

	public void setId_tramite(Long id_tramite) {
		this.id_tramite = id_tramite;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCodigoPredial() {
		return codigoPredial;
	}

	public void setCodigoPredial(String codigoPredial) {
		this.codigoPredial = codigoPredial;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
