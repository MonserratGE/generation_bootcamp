package com.pokemon;

//atributos especificos

public class Chikorita extends TipoPlanta{
	private int numeroCuernitos;
	
	public Chikorita(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas, int numeroCuernitos) {
		super(id, edad, nivel,  nombre, evolucion, numeroHojas);
		this.numeroCuernitos = numeroCuernitos;
	}
	
	//metodos 
	public void latigo() {
		System.out.println(getNombre() + " uso látigo");
	}

	public void atacar() {
		System.out.println(getNombre() + " tipoplanta esta atacando x2");
	}
	//getter y setter
	public int getNumeroCuernitos() {
		return numeroCuernitos;
	}
	

	public void setNumeroCuernitos(int numeroCuernitos) {
		this.numeroCuernitos = numeroCuernitos;
	}
	
	@Override
	public String toString() {
		return "Chikorita [numeroCuernitos=" + numeroCuernitos + "]";
	}
	
	
}
