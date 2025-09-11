package test;
import org.junit.jupiter.api.Test;

import Figuras.Cuadrado;

import static org.junit.jupiter.api.Assertions.*;
public class CuadradoTest {
	@Test
	public void ComprobarResultado() {
		Cuadrado cua1 = new Cuadrado("cuadrado1", 2);
		assertNotEquals(4, cua1.calcularArea());
	}
}
