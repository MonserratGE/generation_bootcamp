package com.calculadora;

public class Calculadora {
	
	//Método que no regresa nada - VOID
	public void sumarMensaje() {
		System.out.println("Voy a sumar dos números.");
	}
	
	// Método que retorna datos
	public String mensaje() {
		String mensaje = "Voy a relaizar una operación";
		return mensaje;
	}
	
	public double prueba() {
		return 2.5;
	}
	
	//Operaciones
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public void sumarM(int a, int b) {
		System.out.println("El resultado es: " + (a+b));
	}
	public int resta(int a, int b) {
		return a - b;
	}
	public int multiplicar(int a, int b) {
		return a * b;
	}
	public double dividir(double a, double b) {
		if(b != 0) {
		return a / b;
		}
		else {
		return -1;
		}
	}
}
