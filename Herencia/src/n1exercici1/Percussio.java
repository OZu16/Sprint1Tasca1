package n1exercici1;

public class Percussio extends Instrument {
	
	public Percussio(String nom, int preu) {
		super(nom, preu);
	}
	
	static {
		System.out.println("\ns'ha creat un instrument de percussio");	
	}
	
	public void tocar() {
		
		System.out.println("Esta sonant un instrument de percussio");
		
	}

	public String toString() {
		
		return "instrument: " + super.getNom() + "	preu: " + super.getPreu();
	}
}