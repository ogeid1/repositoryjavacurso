package org.modelo.persona;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//Serializable: recuperar toda la información

public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String telefono;
	
	//CONSTRUCTORES
	public Persona() {
		super();
	}

	public Persona(Integer id) {
		super();
		this.id = id;
	}
	
	
	public Persona(Integer id, String nombre, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	@Id
	@GeneratedValue
	//GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
