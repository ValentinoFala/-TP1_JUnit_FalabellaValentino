package Figuras;

public class Circulo {
	private double radio;
	private String nombre;
	
	public Circulo(double radio, String nombre) {
		this.radio = radio;
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public double setRadio(double radio) throws IllegalAccessException {
		if(radio == 0) {
			throw new IllegalAccessException("El radio no puede ser 0");
		}
		return this.radio = radio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.getRadio();
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
 	}
}