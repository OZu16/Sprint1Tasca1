package n1exercici1;

public abstract class Instrument {

	private String nom;
	private int preu;

	
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;

	}

	public String getNom() {
		return nom;
	}

	public int getPreu() {
		return preu;
	}

	

	public abstract void tocar();
	public abstract String toString();
	
	
}