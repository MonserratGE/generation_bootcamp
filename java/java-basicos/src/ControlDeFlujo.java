import java.util.Scanner;
public class ControlDeFlujo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tu edad?");
		int edad = sc.nextInt();
	
		//sc.close();
		
		if(edad >= 18) {
			if(edad > 50) {
				System.out.println("Eres un adulto mayor");
			}else {
				System.out.println("Eres mayor de edad");
			}
		}else {
			System.out.println("Eres menor de edad");
		}
		
		String mensaje = (edad >= 18) ? ("Eres mayor de edad x2") : ("Eres menor de edad x2");
		System.out.println(mensaje);
		
		
		System.out.println("Dime el día en que estas: ");
		sc.nextLine();
		String dia = sc.nextLine();

		switch (dia.toLowerCase()) {
		case "viernes":
			System.out.println("Y el cuerpo lo sabe");
			break;
		case "lunes":
			System.out.println("5 minutos más");
			break;	
		case "martes":
			System.out.println("No te cases ni te embarques");
			break;
		case "miercoles":
			System.out.println("Ombligo de la semana");
			break;
		case "jueves":
			System.out.println("Viernes chiquito");
			break;
		}
	}

}
