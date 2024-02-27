package main.com.pablovass.domain;
//este persona me tiene que tener funcionalidade para mi ecomer
//objeto 
public class Persona {
// propiedades  
	// encapsular 
	private  int id;
	private int edad;
	private int dinero; 
	private int numeroDomento; 
	private String nombre; 
	private String apellido; 
	private String domicilio;

	//funcionalidades que hacen al negocio 
	
	public int comprarProducto(int product, int dinero ) {
		
		return product;
	}
	
// para obterner 
	public int getId() {
		return id;
	}
	
	//dar setear
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
