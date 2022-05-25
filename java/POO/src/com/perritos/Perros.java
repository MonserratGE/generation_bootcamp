package com.perritos;

public class Perros {
	//Atributos o propiedades
	String nombre = "Anomimo";
	int edad;
	String raza;
	String tamanho;
	
	//Constructor
	public Perros(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Métodos
	public void ladrar() {
		System.out.println("El perro " + nombre + " hace Guauf");
	}
	
	public int edadPerruna() {
		return edad * 7;
	}
	
	//Métodos estaticos
	//Nos permite utilizarlo sin intanciar un objeto
	public static void mensaje() {
		System.out.println("Esta es una clase Perro");
	}
}
