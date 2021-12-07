package com.example.demo.modAdmin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.modAdmin.models.*;
import com.example.demo.modAdmin.repository.TramiteEstratificacionRepository;

@Service
public class TramiteEstratificacionServiceImpl {
	
	@Autowired
	private TramiteEstratificacionRepository repo;
	
	public List<TramiteEstratificacionSocioEconomica> getAll(){
		
		return (List<TramiteEstratificacionSocioEconomica>) repo.findAll();
		
	}
	
	public TramiteEstratificacionSocioEconomica save(TramiteEstratificacionSocioEconomica t) {
		
		return repo.save(t);
	}
	
	public TramiteEstratificacionSocioEconomica findById(Long id) {
		return repo.findById(id).orElse(null);
	}

}
