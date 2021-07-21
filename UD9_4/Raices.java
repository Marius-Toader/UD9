package UD9_4;

public class Raices {
	protected int a;
	protected int b;
	protected int c;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		int x1, x2;
		x1 = (int)(Math.negateExact(b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / 2 * a);
		x2 = (int)(Math.negateExact(b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / 2 * a);
		System.out.println("Las dos soluciones son " + x1 + " y " + x2);
	}
	
	public void obtenerRaiz() {
		int x;
		x = (int)(Math.negateExact(b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / 2 * a);
		System.out.println("La solución es " + x);
	}
	
	public int getDiscriminante() {
		return (int)(Math.pow(b, 2) - 4 * a * c);
	}
	
	public boolean tieneRaices() {
		if (getDiscriminante() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tieneRaiz() {
		if (getDiscriminante() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		}
		else if (tieneRaiz()) {
			obtenerRaiz();
		}
		else {
			System.out.println("Esta ecuación no tiene raíz");
		}
	}
}