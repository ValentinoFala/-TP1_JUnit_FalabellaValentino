package test;
import org.junit.jupiter.api.Test;

import Figuras.Rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
public class RectanguloTest {
	@Test
	public void perimetroTest() {
		Rectangulo r1 = new Rectangulo(1.2, 3.2, "asd");
		
		assertEquals(8.2, r1.getPerimetro());
	}
	@Test
	@Disabled
	public void areaTest() {
		Rectangulo r1 = new Rectangulo(1.2, 3.2, "asd");
		
		assertEquals(8.2, r1.getArea());
	}
	
}
