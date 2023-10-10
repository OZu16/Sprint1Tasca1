package n2exercici1;

public class Smartphone extends Telephone implements Camera, Clock {
	
	public Smartphone(String marca, String model) {
		super(marca, model);

	}
	
	public void alarma() {
		
		System.out.println("esta sonant l'alarma");
	}
	
	public void fotografiar() {
		
		System.out.println("s'esta fent una fotografia");
		
	}

}