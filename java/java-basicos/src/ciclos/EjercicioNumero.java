package ciclos;

import java.util.Scanner;

public class EjercicioNumero {
	public static void main(String[] args) {
		
		/*Adivina el n�mero

		Escribe un programa en Java que te pida introducir un n�mero 
		y lo compare con otro n�mero que puede ser aleatorio o establecido por t�.
		Mientras que el n�mero no sea igual al establecido como base, 
		el programa se seguir� ejecutando.
		Una vez que ambos n�meros sean iguales, el programa se detendr� 
		y mostrar� lo siguiente en consola:
		
		"Felicidades, adivinaste el n�mero."
		
		
*/
		
		Scanner sc = new Scanner(System.in);
        int numeroBase = 0;
        int numeroAleatorio = (int) (Math.random() * 100);

        System.out.println("Introduce un n�mero entre 0 y 100");
        numeroBase = sc.nextInt();

        while (numeroBase != numeroAleatorio) {
            if (numeroBase > numeroAleatorio) {
                System.out.println("El n�mero es m�s peque�o, prueba otra vez");
                numeroBase = sc.nextInt();
            } else if (numeroBase < numeroAleatorio){
                System.out.println("El n�mero es m�s grande, prueba otra vez");
                numeroBase = sc.nextInt();
            }
        }
        System.out.println("Felicidades, adivinaste el n�mero");

	}
}