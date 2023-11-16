package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.daos.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{

}
