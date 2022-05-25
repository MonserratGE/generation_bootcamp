package com.ejrcicios;

public class Perimetro {
	public void mensaje() {
		System.out.println("Voy a calcular un perimetro");
	}
	
	public double pCuadrado(int l) {
	return l*4;
	}
	
	public double pTriangulo(int l ,int l2 , int l3) {
		return l+l2+l3;
	}

	public void pCirculo(double radio) {
		System.out.println("El resultado es: " + (2*Math.PI*radio));
	}
}
