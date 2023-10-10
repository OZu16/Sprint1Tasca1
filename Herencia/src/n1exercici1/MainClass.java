package n1exercici1;

import java.util.ArrayList;

public class MainClass {
	
	static ArrayList<Instrument> instruments = new ArrayList<Instrument>();
	
	public static void main(String[] args) {

		
		
		instruments.add(new Vent("flauta", 99));
		System.out.println(instruments.get(0).toString());
		instruments.get(0).tocar(); 
		
		
		instruments.add(new Corda("piano", 666));
		System.out.println(instruments.get(1).toString());
		instruments.get(1).tocar(); 
		

		instruments.add(new Percussio("bateria", 555));
		System.out.println(instruments.get(2).toString());
		instruments.get(2).tocar(); 
		

	}

}