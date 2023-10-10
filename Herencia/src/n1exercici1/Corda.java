package n1exercici1;

public class Corda extends Instrument{
	
	public Corda(String nom, int preu) {
		super(nom, preu);
	}
	
	
	static {
		System.out.println("\ns'ha creat un instrument de corda");	
	}
	
	public void tocar() {
		
		System.out.println("Esta sonant un instrument de corda");
		
	}
	public String toString() {
		
		return "instrument: " + super.getNom() + "	preu: " + super.getPreu();
	}
}