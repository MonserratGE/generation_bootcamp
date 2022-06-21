package com.generation.demo.service;

import java.util.List;
import java.util.Map;

import com.generation.demo.model.Cohorte;

public interface CohorteService {
	// Tienes m�todos vac�os
	// Las clases que lo implementen deben cumplir con los m�todos vacios declarados
	
	//Leer
	Cohorte getCohorte(Integer id);
	List<Cohorte> conseguirCohortes();
	
	List<Cohorte> getCohortesByCiudad(String ciudad);
	
	List<Map<String, Object>> getInstructorAlumno();

	//Escribir
	Cohorte saveCohorte(Cohorte cohorte);
	
	
	//Actualizar
	
	
	//Borrar
}
