package com.calculadora;

public class Areas {
	public void mensaje() {
		System.out.println("Voy a calcular un área");
	}
	
	public int areaCuadrado(int l) {
		return l*l;
	}
	
	public double areaTriangulo (int base, int altura) {
		return (base * altura)/2;
	}
}
