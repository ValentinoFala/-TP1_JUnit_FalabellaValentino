package Figuras;
/**
 * Representa una figura geométrica del tipo Rectangulo.
 * a partir de la longitud de su lado.
 * <p>
 * Esta clase puede extenderse para incluir el cálculo del perímetro u otras
 * operaciones específicas.
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class Rectangulo {
	 /** Dimensiones de los lados (lado1, lado2)del cuadrado. */
	private double lado1, lado2;
	/** Nombre identificador del Rectangulo. */
	private String nombre;
	
	/**
     * Crea una nueva instancia de {@code Rectangulo}.
     *
     * @param nombre el nombre de la figura.
     * @param lado la longitud del lado1 y lado2 del cuadrado.
     */
	public Rectangulo(double lado1, double lado2, String nombre) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nombre = nombre;
	}
	 /**
     * Devuelve el largo o ancho del lado1 del Rectangulo.
     *
     * @return el valor del lado1.
     */
	public double getLado1() {
		return lado1;
	}
	/**
     * Establece el largo o ancho para el lado1 del Rectangulo.
     *
     * @param lado el nuevo valor del lado1.
     */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	 /**
     * Devuelve el largo o ancho del lado2 del Rectangulo.
     *
     * @return el valor del lado2.
     */
	public double getLado2() {
		return lado2;
	}
	/**
     * Establece el largo o ancho para el lado2 del Rectangulo.
     *
     * @param lado el nuevo valor del lado2.
     */
	public void setLado1(double lado2) {
		this.lado1 = lado2;
	}
	 /**
     * Devuelve el nombre del Rectangilo.
     *
     * @return el nombre de la Rectangilo.
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * Establece un nuevo nombre para el Rectangulo.
     *
     * @param nombre el nuevo nombre.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Calcula el área del Rectangulo utilizando la fórmula:
     * <pre>Área = lado1 × lado2</pre>
     *
     * @return el área del Rectangulo.
     */
	public double getArea() {
		//double aux = lado1 * lado2; es una opcion pero ocupa mas memoria, preferible en el return
		return this.lado1 * this.lado2;
	}
	/**
     * Calcula el perímetro del Rectangulo utilizando la fórmula:
     * <pre>(lado1 + lado2)*2</pre>
     *
     * @return el perímetro del Rectangulo.
     */
	public double getPerimetro() {
		return (this.lado1 + this.lado2)*2;
	}
	/**
     * Devuelve una cadena con los datos resumidos del Rectangulo.
     * <p>
     * El formato es:
     * <pre>"Nombre: &lt;nombre&gt; Area: &lt;area&gt; Perimetro: &lt;perimetro&gt;"</pre>
     * <p>
     * Este método delega en los getters {@code getNombre()}, {@code getArea()}
     * y {@code getPerimetro()}
     *
     * @return cadena con nombre, área y perímetro de la figura.
     */
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
 	}
	
	
	
}
