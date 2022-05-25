package com.generation.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {
	//Atributos
	private String nombre;
	private String raza;
	private String tamanho;
	private int edad;
	private String color;
	
	private int id;
	private static int contador = 0;
	
	private static Map<Integer, String> humano = new HashMap<Integer, String>();
	
	//Constructor
	public Perro(String nombre, String raza, String tamanho, int edad, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.tamanho = tamanho;
		this.edad = edad;
		this.color = color;
		this.id = ++Perro.contador;
	}
	
	//getters setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setHumano(String value) {
		Perro.humano.put(this.id, value);
	}

	//Métodos
	public void sentar() {
		System.out.println(this.nombre + " se sentó..");
	}
	public void comer() {
		System.out.println(this.nombre + " está comiendo.");
	}
	public void correr() {
		System.out.println(this.nombre + " está corriendo.");
	}
	public void dormir() {
		System.out.println(this.nombre + " está durmiendo.");
	}
	public static String buscarHumano(Integer key) {
		return "El nombre de este humano es " + humano.get(key);
	}
	
	//Método toString
	//Sobreescritura de métodos
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", tamanho=" + tamanho + ", edad=" + edad + ", color="
				+ color + ", id=" + id + "]";
	}
	
}

