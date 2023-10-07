package n1exercici1;

public abstract class Instrument {

	private String nom;
	private int preu;

	
	public Instrument(String nom, int preu) {
		super();
		this.nom = nom;
		this.preu = preu;

	}

	public String getNom() {
		return nom;
	}

	public int getPreu() {
		return preu;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	
	public abstract String tipus();
	
	
}