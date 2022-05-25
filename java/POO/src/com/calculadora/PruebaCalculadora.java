package com.calculadora;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Vamos a calcular");
		
		//Instanciar - Crear un objeto a partir de una clase
		Calculadora cal = new Calculadora();
		
		//Método que no retorna nada - void
		cal.sumarMensaje();
		
		//Método que retorna datos
		System.out.println(cal.mensaje());
		
		double prueba = cal.prueba();
		System.out.println(prueba);
		
		//Método con argumentos
		int suma = cal.sumar(10, 20);
		System.out.println(suma);
		
		cal.sumarM(12, 5);
		
		//Instanciar
		Areas calAreas = new Areas();
		calAreas.mensaje();
		
		int areaCuadrado = calAreas.areaCuadrado(10);
		System.out.println(areaCuadrado);
		
		double areaT = calAreas.areaTriangulo(10, 2);
		System.out.println(areaT);
	}

}
