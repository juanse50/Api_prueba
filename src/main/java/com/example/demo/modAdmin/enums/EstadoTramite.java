package com.example.demo.modAdmin.enums;

public enum EstadoTramite {
	
	PENDIENTE("Pendiente"),
	RECHAZADO("Rechazado"),
	APROBADO("Aprobado");
	
	private String nombre;
	
	private EstadoTramite(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
