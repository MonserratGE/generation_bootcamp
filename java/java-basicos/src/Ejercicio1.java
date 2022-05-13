
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = 11;
		
		if (numero == 10) {
			System.out.println("Exellent!");
		}else if(numero > 9 && numero < 10){
			System.out.println("Good!");
		}else if (numero > 5 && numero <=9){
			System.out.println("Insufficient");
		}else if(numero > 3 && numero <=5){
			System.out.println("Failed!");
		}else if(numero > 10){
			System.out.println("Grade outside range supported!");
		}
		
	}

}


/*Crear una aplicación que reciba un int entre 1 y 10 y que regrese un mensaje según la calificación ingresada.


menos de 3 == "Failed!"
menos de 5 == "Insufficient!"
menor de 9 == "Good!"
10 == "Excellent!"

Mayor de 10 == "Grade outside range supported!"
*/