package test;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de prueba unitaria para la clase {@link Figuras.Circulo}.
 * <p>
 * Verifica el correcto funcionamiento del método {@code setRadio(double)}
 * asegurando que lance la excepción esperada ante valores inválidos.
 * </p>
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class CirculoTest {
	/**
     * Prueba que verifica que el método {@code setRadio(double)} lance
     * una {@link IllegalAccessException} cuando se intenta asignar un
     * valor de radio igual a cero.
     * <p>
     * Caso de prueba negativo: valor de radio inválido.
     * </p>
     */
	@Test
	public void setRadioTest() {
		Circulo c1 = new Circulo(2, "circulo");
		assertThrows(IllegalAccessException.class, () -> {
			c1.setRadio(0);
		});
	}
	
}
