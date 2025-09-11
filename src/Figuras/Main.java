package Figuras;

public class Main {
	public void imprimir(Rectangulo rec) {
		System.out.println(rec.getDatosCompletos());
		
	}
	public void imprimir2(Circulo c) {
		System.out.println(c.getDatosCompletos());
		
	}
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(1.2, 2, "rectangulo1");
		Circulo c1 = new Circulo(2, "circulo1");
		Main M = new Main();
		M.imprimir(r1);
		M.imprimir2(c1);
		
		
	}

}
