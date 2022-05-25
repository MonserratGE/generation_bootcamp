package com.perritos;

public class PruebaPerro {

	public static void main(String[] args) {
		//Instanciar
		Perros perro1 = new Perros("Patitas", 3);
		
		//Cambiar sus atributos
		//perro1.nombre = "Patitas";
		//perro1.edad = 3;
		perro1.raza = "Husky";
		perro1.tamanho = "Mediano";
		
		//Método
		perro1.ladrar();
		int edadP = perro1.edadPerruna();
		System.out.println(edadP);
		
		//perro1.mensaje();
		Perros.mensaje();
		
		Perros perro2 = new Perros("Cookies", 1);
		//perro2.nombre = "Cookies";
		//perro2.edad = 1;
		perro2.raza = "Dalmata";
		perro2.tamanho = "Grande";
		
		perro2.ladrar();
	}

}
