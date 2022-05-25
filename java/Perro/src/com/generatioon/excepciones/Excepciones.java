package com.generatioon.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float division;
		
		//try-catch-finally
		try {
			//codigo que vamos a probar
			division = num1 / num2;
		}catch(ArithmeticException ex) {//la excepcion a observar
			//lo que se va a realizar cuando se detecte una excepcion
			division = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		}catch(NullPointerException ex){
			division = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		} finally {
		
			System.out.println("Finalizó el try catch" );
		}
		
		System.out.println(division);
	}

}

/*public class Excepciones {
	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float division;
		
		//try catch finally
		try {
			//codigo que vamos a probar
			division = num1 / num2;
		}catch(ArithmeticException ex) {//la excepción a observar
			//lo que se va a realizar cuando se detecte una excepcion
			division = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		}catch(NullPointerException ex){
			division = 0.0f;
			System.out.println("Error: " + ex.getMessage());
		}finally {
			System.out.println("Finalizo el try catch.");
		}
		
		//System.out.println(division);
	}
}*/
