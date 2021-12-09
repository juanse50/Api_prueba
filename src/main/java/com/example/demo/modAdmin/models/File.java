package com.example.demo.modAdmin.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="files")
public class File {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_file;
	
	private String nombre;
	
	
	@Column(name="file_type")
	private String fileType;
	
	@Column(name="file_name")
	private String fileName;
	
	@Column(name = "data" ,nullable = true)
    @Basic(optional = false, fetch = FetchType.LAZY)
    @Lob()
	@JsonIgnore
	private byte[] data;

	public Long getId_file() {
		return id_file;
	}

	public void setId_file(Long id_file) {
		this.id_file = id_file;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	
	
	
}