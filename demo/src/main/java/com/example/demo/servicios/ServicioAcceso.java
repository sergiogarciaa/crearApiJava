package com.example.demo.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daos.Acceso;

/**
 * Clase que define los metodos que daran servicio a la clase Acceso
 */
@Service
public class ServicioAcceso {
	
	@Autowired
	private AccesoRepository accesoRepository;
	
	/**
	 * Obtener todos accesos
	 */
	public ArrayList<Acceso> obtenerTodos(){
		return (ArrayList<Acceso>) accesoRepository.findAll();
	}
	
	/**
	 * Obtener un acceso
	 */
	public Optional<Acceso> obtenerPorId(long id){
		return accesoRepository.findById(id);
	}

	
	
}
