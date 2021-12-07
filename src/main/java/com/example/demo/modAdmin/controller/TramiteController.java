package com.example.demo.modAdmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modAdmin.models.TramiteEstratificacionSocioEconomica;
import com.example.demo.modAdmin.serviceImpl.TramiteEstratificacionServiceImpl;

@RestController
@RequestMapping("/tramites/")
public class TramiteController {
	
	@Autowired
	private TramiteEstratificacionServiceImpl serv;
	
	
	@GetMapping("todos")
	public List<TramiteEstratificacionSocioEconomica> todos(){
		return serv.getAll();
	}
	
	@PostMapping("save")
	public TramiteEstratificacionSocioEconomica guardar(@RequestBody TramiteEstratificacionSocioEconomica t) {
		return serv.save(t);
	}
	
	@GetMapping("porId/{id}")
	public TramiteEstratificacionSocioEconomica getById(@PathVariable Long id){
		
		return serv.findById(id);
	}
	

}
