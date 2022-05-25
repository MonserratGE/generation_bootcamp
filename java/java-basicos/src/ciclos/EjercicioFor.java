package ciclos;
import java.util.Scanner;
public class EjercicioFor {
	public static void main(String[] args) {
		
		String correo = "";
        boolean esValido = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un correo");
        correo = sc.nextLine();
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                esValido = true;
                System.out.println("Es un correo válido");
            }
            else {
                esValido = false;
                continue;
            }
            System.out.println("Hola ya termine");
        }

}
}