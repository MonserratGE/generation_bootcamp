import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Ingresa tu peso:");
		float peso = escaner.nextFloat();
		System.out.println("Ingresa tu altura:");
		float altura = escaner.nextFloat();
		
		//float IMC = peso/ (altura * 2);
		double IMC = peso / (Math.pow(altura, 2));

		
		if (IMC >= 18.5 && IMC <= 25) {
			System.out.println("Your weigh ratio is good");
		}else {
			System.out.println("Your health is not good");
		}
		
		//float peso = 12114.23134f; 
	}

}

/*Escribe una aplicación que calcule el indice de masa corporal.

y que lance un mensaje según lo siguiente:

peso (kg) / [estatura (m)]2

Si tiene un IMC entre 18.5 y 25:
"Your weigh ratio is good"

si es menor de 18.5 o mayor de 25:
""Your health is not good"
*/