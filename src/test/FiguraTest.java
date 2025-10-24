package test;
import org.junit.jupiter.api.Test;

import Figuras.Figura;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase de prueba unitaria para la clase {@link Figuras.Figura}.
 * <p>
 * Verifica el comportamiento del método {@code setNombre(String)} 
 * asegurando que gestione correctamente valores nulos.
 * </p>
 * 
 * @author Valentino Falabella
 * @version 1.0
 */
public class FiguraTest {
	 /**
     * Prueba que verifica que el método {@code setNombre(String)} 
     * lance una {@link NullPointerException} cuando se intenta asignar 
     * un valor {@code null} como nombre de la figura.
     * <p>
     * Caso de prueba negativo: valor de nombre inválido.
     * </p>
     */
	@Test
	public void validarNombre() {
		Figura f1 = new Figura("figura2");
		assertThrows(NullPointerException.class, () -> {
			f1.setNombre(null);
		});
	}
}
