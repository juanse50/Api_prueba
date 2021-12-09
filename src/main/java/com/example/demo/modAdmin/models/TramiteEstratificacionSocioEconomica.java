package com.example.demo.modAdmin.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	
	@Column(unique=true, name="codigo_pago")
	private String codigoPago;
	
	private String nombres;
	
	private String apellidos;
	
	
	@OneToMany(mappedBy = "tramite", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JsonManagedReference
	private Set<Soporte> soportes;
	
	
	

	public Set<Soporte> getSoportes() {
		return soportes;
	}

	public void setSoportes(Set<Soporte> soportes) {
		this.soportes = soportes;
	}

	public String getCodigoPago() {
		return codigoPago;
	}

	public void setCodigoPago(String codigoPago) {
		this.codigoPago = codigoPago;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

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
