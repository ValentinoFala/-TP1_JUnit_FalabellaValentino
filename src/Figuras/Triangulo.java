package Figuras;

public class Triangulo extends Figura {

	double base;
	double altura;
	
	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() throws IllegalAccessException {
		if(this.altura == 0 || this.base == 0) {
			throw new IllegalAccessException("No se puede multiplicar por cero");
		}
		return (this.altura * this.base) / 2;
	}
	
}
