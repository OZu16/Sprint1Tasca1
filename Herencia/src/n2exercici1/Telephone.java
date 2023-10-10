package n2exercici1;

public class Telephone {

	private String marca = "";
	private String model = "";
	
	public Telephone(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}
	
	
	public void trucada(String numTelefon) {
	
		System.out.println(this.marca + " esta trucant al telefon " + numTelefon);
	}

}