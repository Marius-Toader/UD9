package UD9_1;

public class Television extends Electrodomestico{
	private static int PULGADAS = 20;
	private static boolean SINTONIZADOR = false;
	
	private int pulgadas;
	private boolean sintonizador;
	
	public Television() {
		this.pulgadas = PULGADAS;
		this.sintonizador = SINTONIZADOR;
	}
	
	public Television(int precio, int peso) {
		super(precio, peso);
	}

	public Television(int precioBase, String color, char consumo, int peso, int pulgadas, boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizador = sintonizador;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}

	public int precioFinal() {
		int precioFinal = super.precioFinal();
		
		if (this.pulgadas > 40) {
			precioFinal += (precioFinal * 0.3);
		}
		if (getSintonizador()) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}
}