package Figuras;

/**
 * Clase base abstracta que representa una figura geométrica genérica.
 * <p>
 * Proporciona atributos y métodos comunes a todas las figuras, como el nombre,
 * el cálculo del área, del perímetro y la obtención de datos completos.
 * <p>
 * Las clases que extienden {@code Figura} deben sobrescribir los métodos
 * {@link #getArea()} y {@link #getPerimetro()} para proporcionar
 * implementaciones específicas.
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class Figura {

    /** Nombre identificador de la figura. */
    private String nombre;

    /**
     * Crea una nueva instancia de {@code Figura}.
     *
     * @param nombre el nombre de la figura.
     * @throws NullPointerException si el nombre es {@code null}.
     */
    public Figura(String nombre) {
        if (nombre == null) {
            throw new NullPointerException("El nombre no puede ser null");
        }
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return el nombre de la figura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la figura.
     *
     * @param nombre el nuevo nombre.
     * @throws NullPointerException si el nombre es {@code null}.
     */
    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new NullPointerException("El nombre no puede ser null");
        }
        this.nombre = nombre;
    }

    /**
     * Devuelve el área de la figura.
     * <p>
     * Este método debe ser sobrescrito por las subclases para devolver
     * el valor correspondiente.
     *
     * @return el área de la figura (por defecto 0).
     */
    public double getArea() {
        return 0;
    }

    /**
     * Devuelve el perímetro de la figura.
     * <p>
     * Este método debe ser sobrescrito por las subclases para devolver
     * el valor correspondiente.
     *
     * @return el perímetro de la figura (por defecto 0).
     */
    public double getPerimetro() {
        return 0;
    }

    /**
     * Devuelve una cadena con los datos completos de la figura.
     * <p>
     * El formato es:
     * <pre>"Nombre: &lt;nombre&gt; Area: &lt;area&gt; Perimetro: &lt;perimetro&gt;"</pre>
     *
     * @return una cadena con el nombre, área y perímetro de la figura.
     */
    public String getDatosCompletos() {
        return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
    }
}
