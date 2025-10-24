package test;
import org.junit.jupiter.api.Test;

import Figuras.Triangulo;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de prueba unitaria para la clase {@link Figuras.Triangulo}.
 * <p>
 * Evalúa el comportamiento del método {@code calcularArea()} 
 * verificando que lance una excepción cuando alguno de sus valores 
 * (base o altura) es igual a cero.
 * </p>
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class TrianguloTest {
	 /**
     * Prueba que verifica que el método {@code calcularArea()} 
     * lance una {@link IllegalAccessException} cuando se intenta calcular 
     * el área con una base o altura igual a cero.
     * <p>
     * Caso de prueba negativo: valores inválidos para el cálculo del área.
     * </p>
     */
	@Test
	public void setRadioTest() {
		Triangulo t1 = new Triangulo("Triangulo", 0, 3.2);
		assertThrows(IllegalAccessException.class, () -> {
			t1.calcularArea();
		});
	}
	
}
