package com.example.demo.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "accesos", schema = "gbp_operacional1")
public class Acceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso", nullable = false)
	private long idAcceso;

	@Column(name = "codigo_acceso", nullable = false)
	private String codigoAcceso;

	@Column(name = "descripcion_acceso")
	private String descripcionAcceso;

	@OneToMany(mappedBy = "acceso")
	private List<Usuario> listaUsuariosConAccesoo;

	public Acceso() {
		super();
	}

	public Acceso(String codigoAcceso, String descripcionAcceso) {
		super();
		this.codigoAcceso = codigoAcceso;
		this.descripcionAcceso = descripcionAcceso;
	}

	public long getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(long idAcceso) {
		this.idAcceso = idAcceso;
	}

	public String getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}

	public String getDescripcionAcceso() {
		return descripcionAcceso;
	}

	public void setDescripcionAcceso(String descripcionAcceso) {
		this.descripcionAcceso = descripcionAcceso;
	}

	public List<Usuario> getListaUsuariosConAccesoo() {
		return listaUsuariosConAccesoo;
	}

	public void setListaUsuariosConAccesoo(List<Usuario> listaUsuariosConAccesoo) {
		this.listaUsuariosConAccesoo = listaUsuariosConAccesoo;
	}
	
	

}



