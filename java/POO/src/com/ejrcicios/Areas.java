package com.ejrcicios;

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
	
	public double areaCirculo (double radio) {
		return Math.PI * Math.pow(radio,2);
	}
}
