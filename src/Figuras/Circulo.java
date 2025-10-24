package Figuras;
/**
 * Representa una figura geométrica del tipo círculo.
 * Hereda de la clase Figura y permite calcular el área y el perímetro
 * a partir del radio proporcionado.
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class Circulo {
	 /** Radio del círculo. */
	private double radio;
	/** nombre del círculo. */
	private String nombre;
	 /**
     * Crea una nueva instancia de la clase {@code Circulo}.
     *
     * @param radio el valor del radio del círculo.
     */
	public Circulo(double radio, String nombre) {
		this.radio = radio;
		this.nombre = nombre;
	}

	/**
     * Devuelve el valor del radio del círculo.
     *
     * @return el radio del círculo.
     */
	public double getRadio() {
		return radio;
	}
	/**
     * Establece un nuevo valor para el radio del círculo.
     *
     * @param radio el nuevo valor del radio.
     */
	public double setRadio(double radio) throws IllegalAccessException {
		if(radio == 0) {
			throw new IllegalAccessException("El radio no puede ser 0");
		}
		return this.radio = radio;
	}
	/**
     * Devuelve el nombre del círculo.
     *
     * @return el radio del círculo.
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * Establece un nuevo nombre para el círculo.
     *
     * @param radio el nuevo valor del radio.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Calcula el área del círculo utilizando la fórmula:
     * <pre>Área = π × radio²</pre>
     *
     * @return el área del círculo.
     */
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	/**
     * Calcula el perímetro del círculo utilizando la fórmula:
     * <pre>Perímetro = 2 × π × radio</pre>
     *
     * @return el perímetro del círculo.
     */
	public double getPerimetro() {
		return 2 * Math.PI * this.getRadio();
	}
	/**
     * Devuelve una cadena con los datos resumidos de la figura.
     * <p>
     * El formato es:
     * <pre>"Nombre: &lt;nombre&gt; Area: &lt;area&gt; Perimetro: &lt;perimetro&gt;"</pre>
     * <p>
     * Este método delega en los getters {@code getNombre()}, {@code getArea()}
     * y {@code getPerimetro()} que se espera existan y estén implementados
     * en la superclase {@code Figura}.
     *
     * @return cadena con nombre, área y perímetro de la figura.
     */
	public String getDatosCompletos() {
		return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
 	}
}
