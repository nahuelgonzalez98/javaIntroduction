package main.com.pablovass.domain;
//este persona me tiene que tener funcionalidade para mi ecomer
//objeto

//diferecias entre objeto y clase 

//una clase es una plantilla java - y puede o no ser un objeto  
// un objeto = una representacion de una cosa de vida real y se reprenta en una clase. 

public class Persona {
// propiedades  
	// encapsular  
	private int id; // atributo - propiedades - variables  
	private int edad;
	private int dinero; 
	private int numeroDomento; 
	private String nombre; 
	private String apellido; 
	private String domicilio;

	//funcionalidades que hacen al negocio 
	//una funcionalidad
	public int comprarProducto(int product, int dinero ) {
		// la funcionalidad
		return product;
	}
	
// metodos para interactuar con las propiedades - atributos - variables  
	//los setter y gettes 
	public int getId() {
		return id;
	}
	
	//dar setear
	// tiene que hacer una sola cosa 
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getNumeroDomento() {
		return numeroDomento;
	}
	public void setNumeroDomento(int numeroDomento) {
		this.numeroDomento = numeroDomento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	} 
	

	@Override
	public String toString() {
		return "Persona [id=" + id + ", edad=" + edad + ", dinero=" + dinero + ", numeroDomento=" + numeroDomento
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + "]";
	}

}
