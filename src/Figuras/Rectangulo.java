package Figuras;

public class Rectangulo {
	
	private double lado1, lado2;
	private String nombre;
	
	public Rectangulo(double lado1, double lado2, String nombre) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		//double aux = lado1 * lado2; es una opcion pero ocupa mas memoria, preferible en el return
		return this.lado1 * this.lado2;
	}
	
	public double getPerimetro() {
		return (this.lado1 + this.lado2)*2;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
 	}
	
	
	
}
