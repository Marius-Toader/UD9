package UD9_1;

public class ElectrodomesticoApp {
	public static Electrodomestico[] relleno(Electrodomestico[] electrodomesticos) {
		electrodomesticos[0] = new Electrodomestico(200, "azul", 'B', 40);
		electrodomesticos[1] = new Electrodomestico(250, "gris", 'A', 35);
		electrodomesticos[2] = new Electrodomestico(200, "blanco", 'A', 60);
		electrodomesticos[3] = new Lavadora(300, "blanco", 'A', 50, 7);
		electrodomesticos[4] = new Lavadora(250, "negro", 'C', 55, 6);
		electrodomesticos[5] = new Lavadora(400, "azul", 'A', 65, 9);
		electrodomesticos[6] = new Lavadora(350, "negro", 'B', 55, 7);
		electrodomesticos[7] = new Television(600, "rojo", 'A', 50, 44, true);
		electrodomesticos[8] = new Television(800, "negro", 'A', 60, 49, false);
		electrodomesticos[9] = new Television(400, "gris", 'B', 40, 39, true);
		
		return electrodomesticos;
	}
	
	public static void sumas(Electrodomestico[] electrodomesticos, int sumaE, int sumaT, int sumaL) {
		for (int i = 0; i < 10; i++) {
			if (electrodomesticos[i] instanceof Lavadora) {
				sumaL += electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Television) {
				sumaT += electrodomesticos[i].precioFinal();
			}
			sumaE += electrodomesticos[i].precioFinal();
		}
		
		System.out.println("Precio de las lavadoras: " + sumaL);
		System.out.println("Precio de las televisiones: " + sumaT);
		System.out.println("Precio de los electrodomésticos: " + sumaE);
	}

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		int sumaElectrodomesticos = 0, sumaTelevisiones = 0, sumaLavadoras = 0;
		
		electrodomesticos = relleno(electrodomesticos);
		sumas(electrodomesticos, sumaElectrodomesticos, sumaTelevisiones, sumaLavadoras);
	}
}