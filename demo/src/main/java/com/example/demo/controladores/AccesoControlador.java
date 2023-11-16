package com.example.demo.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.Acceso;
import com.example.demo.servicios.ServicioAcceso;

@RestController
@RequestMapping("/accesos")
public class AccesoControlador {

	
	@Autowired
	private ServicioAcceso accesoServicio;
	
	
	@GetMapping("/todos")
	public ArrayList<Acceso> obtenerTodos(){
		return (ArrayList<Acceso>) accesoServicio.obtenerTodos();
	}
	
	@GetMapping("/id/{id}")
	public Optional<Acceso> obtenerPorID(@PathVariable("id") long id){
		return accesoServicio.obtenerPorId(id);
	}
}
