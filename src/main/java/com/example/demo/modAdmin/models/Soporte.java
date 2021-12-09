package com.example.demo.modAdmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.modAdmin.enums.TipoSoporte;

@Entity
@Table(name="soportes")
public class Soporte {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_soporte;

@Enumerated(EnumType.ORDINAL)
@Column(name = "tipo_soporte", nullable = false)
private TipoSoporte tipo;

@ManyToOne(optional = false)
@JoinColumn(name = "id_file", referencedColumnName = "id_file")
private File file;

@ManyToOne
private TramiteEstratificacionSocioEconomica tramite;

public TipoSoporte getTipo() {
	return tipo;
}

public void setTipo(TipoSoporte tipo) {
	this.tipo = tipo;
}

public File getFile() {
	return file;
}

public void setFile(File file) {
	this.file = file;
}

public TramiteEstratificacionSocioEconomica getTramite() {
	return tramite;
}

public void setTramite(TramiteEstratificacionSocioEconomica tramite) {
	this.tramite = tramite;
}





}