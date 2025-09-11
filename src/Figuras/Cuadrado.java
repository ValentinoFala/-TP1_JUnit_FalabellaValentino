package Figuras;

public class Cuadrado extends Figura {
	
	double lado;

	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return this.lado * this.lado;
	}

	
}
