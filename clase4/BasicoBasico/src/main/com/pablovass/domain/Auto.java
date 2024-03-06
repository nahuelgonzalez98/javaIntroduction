package main.com.pablovass.domain;

public class Auto {
	//encapsulamiento  dice : los atributos tienen que ser privados y que se 
	//tiene que acceder a ello por medio de sus metodo setter y getters
	private int color;
	private Integer puertas;
	private int ruedas;

	
	public int getRuedas() {
		return ruedas;
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
}
