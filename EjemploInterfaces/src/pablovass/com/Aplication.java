package pablovass.com;

import java.util.Scanner;

import pablovass.com.domain.Cliente;
import pablovass.com.domain.Persona;

public class Aplication {
	
public static void main(String[] args) {
	
	Persona josePersona = new Persona(3243434,"jose"); 
	Persona estebanPersona = new Persona();
	Persona pDatosCompletos= new Persona(323,"pedro","Lopez");
	
	estebanPersona.sumar(1,3,3);
	
	Cliente cliente1= new Cliente();
	cliente1.sumar(0, 0);
	
}
}
