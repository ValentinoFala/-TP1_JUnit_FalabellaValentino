package test;
import org.junit.jupiter.api.Test;

import Figuras.Cuadrado;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de prueba unitaria para la clase {@link Figuras.Cuadrado}.
 * <p>
 * Evalúa el comportamiento del método {@code calcularArea()} 
 * verificando que el resultado no coincida con un valor incorrecto esperado.
 * </p>
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class CuadradoTest {
	/**
     * Prueba que verifica que el método {@code calcularArea()} 
     * no devuelva un valor erróneo.
     * <p>
     * Caso de prueba negativo: se comprueba que el área calculada 
     * no sea igual al valor esperado incorrecto (4).
     * </p>
     */
	@Test
	public void ComprobarResultado() {
		Cuadrado cua1 = new Cuadrado("cuadrado1", 2);
		assertNotEquals(4, cua1.calcularArea());
	}
}
