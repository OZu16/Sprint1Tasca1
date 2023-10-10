package n1exercici1;

public class Vent extends Instrument{

	public Vent(String nom, int preu) {
		super(nom, preu);
	}
	
	
	static {
		System.out.println("\ns'ha creat un instrument de vent");	
	}
	
	public void tocar() {
		
		System.out.println("Esta sonant un instrument de vent");
	}
	
	public String toString() {
		
		return "instrument: " + super.getNom() + "	preu: " + super.getPreu();
	}
}