package com.generation.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity //representación de información que nosotros necesitamos
@Table(name = "cohorte")
public class Cohorte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cohorte;
	
	@Column(nullable = false)
	private Integer numeroCohorte;
	
	@Column(nullable = false, length = 50)
	private String ciudad;
	
	//Relacionar la llave foranea
	
	@OneToMany(mappedBy = "cohorte")
	private List<Alumno> alumnos;
	
	@OneToOne(mappedBy = "cohorte")
	private Instructor instructor;

	
	//getter y setters
	public Integer getId_cohorte() {
		return id_cohorte;
	}

	public void setId_cohorte(Integer id_cohorte) {
		this.id_cohorte = id_cohorte;
	}

	public Integer getNumeroCohorte() {
		return numeroCohorte;
	}

	public void setNumeroCohorte(Integer numeroCohorte) {
		this.numeroCohorte = numeroCohorte;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
