package n1exercici2;

public class Cotxe {
	
	private static final String marca = "toyota";
	private static String model = "xaxo";
	private final int potencia = 999;
	
	public static void frenar(Cotxe cotxe) {
		
		System.out.println("estic frenant");
	}
	
	public void accelerar(){
		
		System.out.println("estic accelerant");
	}

}