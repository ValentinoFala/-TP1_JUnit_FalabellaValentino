package Figuras;
/**
 * Representa una figura geométrica del tipo Triangulo.
 * Hereda de la clase {@code Figura} e implementa el cálculo del área
 * a partir de la longitud de su lado.
 * <p>
 * Esta clase puede extenderse para incluir el cálculo del perímetro u otras
 * operaciones específicas.
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class Triangulo extends Figura {
	 /** base del Triangulo. */
	double base;
	/** altura del Triangulo. */
	double altura;
	 /**
     * Crea una nueva instancia de la clase {@code Triangulo}.
     *
     * @param base el valor del base del Triangulo.
	 * @param altura el valor del altura del Triangulo.
     */
	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}
	 /**
     * Devuelve la base del Triangulo.
     *
     * @return el valor de la base.
     */
	public double getBase() {
		return base;
	}
	/**
     * Establece una nueva base para el lado del Triangulo.
     *
     * @param base el nuevo valor de base.
     */
	public void setBase(double base) {
		this.base = base;
	}
	 /**
     * Devuelve la altura del lado del Triangulo.
     *
     * @return el valor de la altura.
     */
	public double getAltura() {
		return altura;
	}
	/**
     * Establece una nueva altura para el lado del Triangulo.
     *
     * @param altura el nuevo valor de altura.
     */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
    * Calcula el área de un triángulo en base a su altura y base.
    * <p>
    * Verifica que ninguno de los valores sea cero antes de realizar el cálculo,
    * ya que no es posible calcular el área con dimensiones nulas.
    * </p>
    *
    * @return el área del triángulo, calculada como {@code (base * altura) / 2}.
    * @throws IllegalAccessException si la base o la altura son iguales a cero.
    */
	public double calcularArea() throws IllegalAccessException {
		if(this.altura == 0 || this.base == 0) {
			throw new IllegalAccessException("No se puede multiplicar por cero");
		}
		return (this.altura * this.base) / 2;
	}
	
}
