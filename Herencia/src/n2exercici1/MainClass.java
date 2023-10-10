package n2exercici1;

public class MainClass {

	public static void main(String[] args) {
		
		Smartphone telephone1 = new Smartphone("nokia","nokia 3310"); 
		Camera photo = telephone1;		
		Clock alarm = telephone1;
		
		String numTelephone = "999999999";
		
		telephone1.trucada(numTelephone);
		photo.fotografiar();
		alarm.alarma();

	}

}