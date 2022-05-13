import java.util.Objects;
public class OperadoresLogicos {


    public static void main(String[] args) {
        int num = 12;
        num = 45;
        num = Integer.parseInt("45");

        //System.out.println(num);
        int num1, num2;
        num1 = 10;
        num2 = 20;
        //System.out.println("num: " + num1);

        // Operador de comparación
        //System.out.println("num: " + num2);
        //System.out.println(num1 == num2);
        
        // .equals()
        //System.out.println(Objects.equals(num1, num2));
        
        // <,>,<=,>=
        int num3, num4;
        
        num3 = 25;
        num4 = 20;
        
//        System.out.println(num3 < num4);
//        System.out.println(num3 > num4);
//        System.out.println(num3 <= num4);
//        System.out.println(num3 >= num4);
        
        if(num3 < num4) {
        	//código a ejecutar
        	//System.out.println("Número 3 es menor");
        }else {
        	//System.out.println("Número 3 es mayor");
        }
        
        // !=
        
        //System.out.println(num3 != num4);
        
        boolean comparacion = num3 != num4;
        //System.out.println(comparacion);
        
        // Operadores Lógicos
        // AND = && --> ambos valores deben ser true para  que regrese true
        // OR = ||
        // NOT = !
        
        System.out.println(true && true);
        System.out.println(false || false);
        System.out.println(!true && true);
        System.out.println(!(false && true));
        
        
    }
    
    
}
