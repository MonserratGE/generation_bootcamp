
public class ConversionDeDatos {

	public static void main(String[] args) {
		byte numeroByte = 127;
		short numeroShort = numeroByte;
		int numeroInt = numeroShort;
		long numeroLong = 50000000;
		
//		Casteo o parseo
		int otroInt = (int) numeroLong;
		short otroShort = (short) otroInt;
		byte otroByte = (byte) otroShort;
		
		
		System.out.println(otroShort);
		
	}

}
