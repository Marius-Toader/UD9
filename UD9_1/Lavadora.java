package UD9_1;

public class Lavadora extends Electrodomestico {
	private final int CARGA = 5;
	
	private int carga;
	
	public Lavadora() {
		this.carga = CARGA;
	}
	
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	
	public Lavadora(int precio, String color, char consumo, int peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	public int precioFinal() {
		int precioFinal = super.precioFinal();
		
		if (this.carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}
}