package test;
import org.junit.jupiter.api.Test;

import Figuras.Figura;

import static org.junit.jupiter.api.Assertions.*;
public class FiguraTest {
	@Test
	public void validarNombre() {
		Figura f1 = new Figura("figura2");
		assertThrows(NullPointerException.class, () -> {
			f1.setNombre(null);
		});
	}
}
