package com.example.demo.modAdmin.container;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class EstratificacionApi implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -777275812027975941L;
	private String documento;
	private String codigoPredial;
	private String correo;
	private String numero;
	private String direccion;
	private String codigoPago;
	private String nombres;
	private String apellidos;
	private MultipartFile file=null;
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
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	
	

}
