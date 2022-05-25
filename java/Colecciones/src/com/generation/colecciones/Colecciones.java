package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		//List - ArrayLlist
		System.out.println("\t\tList --- ArrayList");
		List<String> myArray = new ArrayList<String>();
		myArray.add("Pedro");
		myArray.add("Yair");
		myArray.add("María");
		myArray.add(1, "Raul");
		
		String elemento = myArray.remove(1);
		/*Si especificamos el elemento 
		nos regresa un booleano*/
		
		System.out.println(myArray);
		System.out.println(myArray.size());//length
		System.out.println(elemento);
		
		imprimir(myArray);
		//Colecciones.imprimir(myArray);
		
		/*	DATOS COMPUESTOS, valores referenciados
		 *  WRAPPERS
		 *  long ==> Long
		 *  double ==> Double
		 *  int ==> Integer
		 *  boolean ==> Boolean
		 */
		
		int num1 = 10;
		Integer num2 = 10;
		
		System.out.println(num2.getClass().getSimpleName());
		
		System.out.println(num2 instanceof Integer);
		//System.out.println(num1.getClass());
		
		List<Integer> myArray2 = new ArrayList<Integer>();
		myArray2.add(3);
		myArray2.add(123);
		myArray2.add(1234);
		
		imprimir(myArray2);
		
		System.out.println("\t\tSet --- HashSet");
		Set<String> mySet = new HashSet<String>();
		//No acepta elementos duplicados
		//No los guarda en un orden específico
		//La función que funcioona más rápido
		mySet.add("Marta");
		mySet.add("Marta");
		mySet.add("Lupe");
		mySet.add("Juan");
		mySet.add("Juan");
		mySet.add("Gabriel");
		
		mySet.remove("Lupe");
		
		imprimir(mySet);
		
		System.out.println(mySet.contains("Yair"));
	
		//Map
		// <Key/llave, value/valor>
		System.out.println("\t\tMap --- HashMap");
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("Valor 1", 18);
		myMap.put("Valor 1", 7);
		myMap.put("Valor 2", 10);
		myMap.put("Valor 3", 20);
		myMap.put("Valor 4", 9);
		myMap.put("Valor 5", 19);
		
		System.out.println(myMap);
		System.out.println(myMap.values());//todos los valores
		System.out.println(myMap.keySet());//todas las llaves
		
		System.out.println(myMap.get("Valor 1"));
	
		for(String llave : myMap.keySet()) {
			System.out.println(llave + " : " + myMap.get(llave));
		}
		
		
	}
	
	
	
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion) {
			System.out.println("Elemento = " + elemento);
			
		}
	}
}
