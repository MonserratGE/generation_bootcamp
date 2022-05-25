import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("1) Suma   2) Resta   3) Multiplicacion   4) Division");
		System.out.println("Introduce el numero de la operacion a realizar");
		int ope = data.nextInt();
		
		switch (ope) {
		case 1:
			System.out.println("Introduce dos numeros para tu suma:");
			int num1 = data.nextInt();
			int num2 = data.nextInt();
			int suma = num1 + num2;
			System.out.println("El resultado es: " + suma);
			break;
		case 2:
			System.out.println("Introduce dos numeros para tu resta:");
			int num3 = data.nextInt();
			int num4 = data.nextInt();
			int resta = num3 - num4;
			System.out.println("El resultado es: " + resta);
			break;	
		case 3:
			System.out.println("Introduce dos numeros para tu multiplicacion:");
			int num5 = data.nextInt();
			int num6 = data.nextInt();
			int mul = num5 * num6;
			System.out.println("El resultado es: " + mul);
			break;
		case 4:
			System.out.println("Introduce dos numeros para tu division"); 
			int num7 = data.nextInt();
			int num8 = data.nextInt();
			if (num8 == 0) {
				System.out.println("No puedes dividir entre 0");
			}else {
				double div = (float)num7 / (float)num8;
				System.out.println("El resultado es: " + div);
			}
			break;
		}  // :)
	}

}
