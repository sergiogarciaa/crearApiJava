package com.example.demo.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daos.Usuario;

/**
 * Clase que define los metodos que daran servicio a la clase Usuario
 */
@Service
public class ServicioUsuario {
	
	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	/**
	 * Obtener todos los usuarios
	 */
	public ArrayList<Usuario> obtenerTodos() {
		return (ArrayList<Usuario>) UsuarioRepository.findAll();
	}
	
	/**
	 * Obtener un usuario por su id 
	 */
	public Optional<Usuario> obtenerPorID(long id) {
		return UsuarioRepository.findById(id);
	}

}
