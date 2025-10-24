package Figuras;

/**
 * Representa una figura geométrica del tipo cuadrado.
 * Hereda de la clase {@code Figura} e implementa el cálculo del área
 * a partir de la longitud de su lado.
 * <p>
 * Esta clase puede extenderse para incluir el cálculo del perímetro u otras
 * operaciones específicas.
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class Cuadrado extends Figura {
    
    /** Longitud del lado del cuadrado. */
    private double lado;

    /**
     * Crea una nueva instancia de {@code Cuadrado}.
     *
     * @param nombre el nombre de la figura.
     * @param lado la longitud del lado del cuadrado.
     */
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    /**
     * Devuelve la longitud del lado del cuadrado.
     *
     * @return el valor del lado.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Establece una nueva longitud para el lado del cuadrado.
     *
     * @param lado el nuevo valor del lado.
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área del cuadrado utilizando la fórmula:
     * <pre>Área = lado × lado</pre>
     *
     * @return el área del cuadrado.
     */
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
