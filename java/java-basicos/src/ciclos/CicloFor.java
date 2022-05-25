package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		
		/*for (int i=0; i<5; i++) {
			System.out.println("Hola " + i);
		}
		
		for (int i=5; i>0; i--) {
			System.out.println("Holax2 " + i);
		
		}
		
		for (int i=0; i<20; i += 2) {
			System.out.println("Holax3 " + i);
		}
		*/
		//continue && brak
		
		for (int i=0; i<10; i++) {
			if(i % 2 == 0) {
				//continue; //saltar
				break;
			}
			
			System.out.println(i);
		}
	}

}
