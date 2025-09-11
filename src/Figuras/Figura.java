package Figuras;

public class Figura {
	public String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre== null) {
			throw new NullPointerException("El nombre no puede ser Null");
		}
		this.nombre = nombre;
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimetro() {
		return 0;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
 	}

}
