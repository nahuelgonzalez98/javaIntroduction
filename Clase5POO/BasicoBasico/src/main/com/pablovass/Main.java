package main.com.pablovass;
import main.com.pablovass.domain.Persona;


public class Main {
//nuestra configuracion
	public static void main(String[] args) {
		// creee objeto persona
		Persona pedro = new Persona();
		 // dar a pedro 
		pedro.setDinero(20);
		//cuanto tiene pedro 
		System.out.println("pedro tiene :"+ pedro.getDinero()+ "pesos" );
		
	}

}
