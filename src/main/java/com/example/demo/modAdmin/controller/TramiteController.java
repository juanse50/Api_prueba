package com.example.demo.modAdmin.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modAdmin.container.EstratificacionApi;
import com.example.demo.modAdmin.enums.TipoSoporte;
import com.example.demo.modAdmin.models.File;
import com.example.demo.modAdmin.models.Soporte;
import com.example.demo.modAdmin.models.TramiteEstratificacionSocioEconomica;
import com.example.demo.modAdmin.serviceImpl.FileServiceImpl;
import com.example.demo.modAdmin.serviceImpl.TramiteEstratificacionServiceImpl;

@RestController
@RequestMapping("/tramites/")
public class TramiteController {
	
	@Autowired
	private TramiteEstratificacionServiceImpl serv;
	
	@Autowired
	private FileServiceImpl fileServ;
	
	
	@GetMapping("todos")
	public List<TramiteEstratificacionSocioEconomica> todos(){
		return serv.getAll();
	}
	
	@PostMapping(value = "save", consumes = { "multipart/form-data" })
	public TramiteEstratificacionSocioEconomica guardar(@ModelAttribute EstratificacionApi t) {
		
		TramiteEstratificacionSocioEconomica tr= new TramiteEstratificacionSocioEconomica();
		tr.setApellidos(t.getApellidos());
		tr.setCodigoPago(t.getCodigoPago());
		tr.setCodigoPredial(t.getCodigoPredial());
		tr.setCorreo(t.getCorreo());
		tr.setDireccion(t.getDireccion());
		tr.setDocumento(t.getDocumento());
		tr.setNombres(t.getNombres());
		tr.setNumero(t.getNumero());
		
		Set<Soporte> soportes = new HashSet<>();
		
		File mppFile = fileServ.save(t.getFile());
		
		if(mppFile != null) {
			
			Soporte sop= new Soporte();
			
			sop.setFile(mppFile);
			sop.setTipo(TipoSoporte.PAGO);
			sop.setTramite(tr);
			soportes.add(sop);
		}
		
		tr.setSoportes(soportes);
		
		return serv.save(tr);
		
	}
	
	@GetMapping("porId/{id}")
	public TramiteEstratificacionSocioEconomica getById(@PathVariable Long id){
		
		return serv.findById(id);
	}
	

}
