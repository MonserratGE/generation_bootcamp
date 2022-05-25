package com.generation.test;

import com.generation.model.Perro;

public class PruebaPerr {
	public static void main(String[] args) {
		Perro pelusa = new Perro("Pelusa", "French", "chico", 4, "Blanco");
		Perro solovino = new Perro("Solovino", "Mestizo", "Mediano", 2, "Café");
		
		pelusa.setHumano("Pedro");
		solovino.setHumano("Daniel");
		
		System.out.println(pelusa);
		System.out.println(solovino);
		
		pelusa.comer();
		
		System.out.println(Perro.buscarHumano(2));
		System.out.println(Perro.buscarHumano(1));
	}
}
