package test;
import org.junit.jupiter.api.Test;

import Figuras.Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
/**
 * Clase de prueba unitaria para la clase {@link Figuras.Rectangulo}.
 * <p>
 * Evalúa el comportamiento de los métodos {@code getPerimetro()} y {@code getArea()} 
 * verificando los resultados esperados en función de las dimensiones establecidas.
 * </p>
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class RectanguloTest {
	/**
     * Prueba que verifica el cálculo correcto del perímetro del rectángulo.
     * <p>
     * Caso de prueba positivo: se espera que el método {@code getPerimetro()} 
     * devuelva el valor correcto (8.2) según la base y altura proporcionadas.
     * </p>
     */
	@Test
	public void perimetroTest() {
		Rectangulo r1 = new Rectangulo(1.2, 3.2, "asd");
		
		assertEquals(8.2, r1.getPerimetro());
	}
	/**
     * Prueba que verifica el cálculo del área del rectángulo.
     * <p>
     * Este test está deshabilitado temporalmente mediante {@link Disabled}, 
     * por lo que no se ejecutará durante las pruebas automatizadas.
     * </p>
     * <p>
     * Caso de prueba positivo: se espera que el método {@code getArea()} 
     * devuelva el valor 8.2.
     * </p>
     */
	@Test
	@Disabled
	public void areaTest() {
		Rectangulo r1 = new Rectangulo(1.2, 3.2, "asd");
		
		assertEquals(8.2, r1.getArea());
	}
	
}
