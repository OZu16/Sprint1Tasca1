package n1exercici1;

import java.util.ArrayList;

public class MainClass {
	
	static ArrayList<Instrument> instruments = new ArrayList<Instrument>();
	
	public static void main(String[] args) {

		
		
		instruments.add(new Vent("flauta", 99));
		instruments.add(new Corda("piano", 666));
		instruments.add(new Percussio("bateria", 555));
		
		System.out.println(instruments.get(0).tipus());
		System.out.println(instruments.get(1).tipus());
		System.out.println(instruments.get(2).tipus());

	
	}

}