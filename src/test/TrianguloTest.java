package test;
import org.junit.jupiter.api.Test;

import Figuras.Triangulo;

import static org.junit.jupiter.api.Assertions.*;
public class TrianguloTest {
	@Test
	public void setRadioTest() {
		Triangulo t1 = new Triangulo("Triangulo", 0, 3.2);
		assertThrows(IllegalAccessException.class, () -> {
			t1.calcularArea();
		});
	}
	
}
