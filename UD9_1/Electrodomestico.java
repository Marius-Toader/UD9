package UD9_1;

public class Electrodomestico {
	protected final String COLOR = "blanco";
	protected final int PRECIOBASE = 100;
	protected final char CONSUMO = 'F';
	protected final int PESO = 5;
	
	protected int precioBase;
	protected String color;
	protected char consumo;
	protected int peso;
	
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	private static boolean comprobarConsumo(char consumo) {
		boolean valido = false;
		switch (consumo) {
			case 'A': valido = true;
				break;
			case 'B': valido = true;
				break;
			case 'C': valido = true;
				break;
			case 'D': valido = true;
				break;
			case 'E': valido = true;
				break;
			case 'F': valido = true;
				break;
		}
		return valido;
	}
	
	private static boolean comprobarColor(String color) {
		boolean valido = false;
		switch (color) {
			case "blanco": valido = true;
				break;
			case "negro": valido = true;
				break;
			case "rojo": valido = true;
				break;
			case "azul": valido = true;
				break;
			case "gris": valido = true;
				break;
		}
		return valido;
	}
	
	public Electrodomestico(int precio, int peso) {
		this.precioBase = precio;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = peso;
	}
	
	public Electrodomestico(int precio, String color, char consumo, int peso) {
		this.precioBase = precio;
		if (comprobarColor(color)) {
			this.color = color;
		}
		else {
			this.color = COLOR;
		}
		if (comprobarConsumo(consumo)) {
			this.consumo = consumo;
		}
		else {
			this.consumo = CONSUMO;
		}
		this.peso = peso;
	}
	
	public int precioFinal() {
		int precioFinal = this.precioBase;
		char consumo = this.consumo;
		int peso = this.peso;
		
		switch (consumo) {
			case 'A': precioFinal += 100;
				break;
			case 'B': precioFinal += 80;
				break;
			case 'C': precioFinal += 60;
				break;
			case 'D': precioFinal += 50;
				break;
			case 'E': precioFinal += 30;
				break;
			case 'F': precioFinal += 10;
				break;
		}
		
		if (peso > 0 && peso <= 19) {
			precioFinal += 10;
		}
		else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		}
		else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		}
		else {
			precioFinal += 100;
		}
		return precioFinal;
	}
	
	public int getPrecioBase() {
		return precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}
}