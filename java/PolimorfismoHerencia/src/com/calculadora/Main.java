package com.calculadora;

public class Main {

	public static void main(String[] args) {
		//Instanciar
		Calculadora cal = new Calculadora(5,8);
		cal.sumar(5,8);
		
		Calculadora cal2 = new Calculadora(1,2,3);
		cal2.sumar(5,2,4);
		
		cal2.sumar(0,0);
		
		Calculadora cal3 = new Calculadora(1,2,3,"Cal3");
		System.out.println(1);
		System.out.println("String");
		System.out.println(1.5);
		
	}

}
