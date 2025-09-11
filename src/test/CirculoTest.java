package test;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;

import static org.junit.jupiter.api.Assertions.*;
public class CirculoTest {
	@Test
	public void setRadioTest() {
		Circulo c1 = new Circulo(2, "circulo");
		assertThrows(IllegalAccessException.class, () -> {
			c1.setRadio(0);
		});
	}
	
}
