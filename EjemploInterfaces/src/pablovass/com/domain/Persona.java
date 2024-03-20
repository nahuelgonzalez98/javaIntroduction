package pablovass.com.domain;
//clase padre 
//herencia pura 
public abstract class Persona {

	public int dni;
	public String nombre;
	public String apellido; 
	
	public Persona() {} // se crea cuando tenemos uno con parametros
	
	
	// es una estructura para definir un objeto 
	public Persona(int dni) {
		this.dni = dni;
	}
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Persona(int dni, String nombre,String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}	
	
	public void sumar(int n1,int n2){
		
	}
	
	public void sumar(int n1,int n2,int n3){
		// valido el dni 
		//hago la resta 
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
