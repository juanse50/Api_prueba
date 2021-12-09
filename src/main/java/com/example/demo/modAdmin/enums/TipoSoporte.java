package com.example.demo.modAdmin.enums;

public enum TipoSoporte {
	
	PAGO("Pago"),
	DOCUMENTO("Documento");
	
	private String nombre;
	
	private TipoSoporte(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
