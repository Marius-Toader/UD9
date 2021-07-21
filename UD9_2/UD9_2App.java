package UD9_2;

public class UD9_2App {
	
	public static Serie[] llenarSeries(Serie[] array) {
		array[0] = new Serie("Demon Slayer", 2, "acción", "Koyoharu Gotouge");
		array[1] = new Serie("Dinastía", 4, "drama", "Sallie Patrick");
		array[2] = new Serie("Código Lyoko", 5, "acción", "Tania Palumbo");
		array[3] = new Serie("Bola de dragón", 3, "aventura", "Akira Toriyama");
		array[4] = new Serie("Avatar: la leyenda de Aang", 3, "fantasía", "Michael Dante DiMartino");
		
		return array;
	}
	
	public static Videojuego[] llenarVideojuegos(Videojuego[] array) {
		array[0] = new Videojuego("Metin2", 248, "MMORPG", "Ymir");
		array[1] = new Videojuego("Call of Duty: Black Ops II", 205, "FPS", "Treyarch");
		array[2] = new Videojuego("League of Legends", 150, "MOBA", "Riot");
		array[3] = new Videojuego("Risk of Rain 2", 118, "Rogue-like", "Hopoo");
		array[4] = new Videojuego("Counter-Strike: Global Offensive", 173, "FPS", "Valve");
		
		return array;
	}
	
	public static void entregar(Serie[] array) {
		array[0].entregar();
		array[2].entregar();
	}
	public static void entregar(Videojuego[] array) {
		array[0].entregar();
		array[1].entregar();
		array[3].entregar();
	}
	
	public static void contarEntregas(Serie[] arrayS, Videojuego[] arrayV) {
		int contadorS = 0, contadorJ = 0;
		for (int i = 0; i < 5; i++) {
			if (arrayS[i].isEntregado()) {
				contadorS++;
				arrayS[i].devolver();
			}
			if (arrayV[i].isEntregado()) {
				contadorJ++;
				arrayV[i].devolver();
			}
		}
		System.out.println("Hay " + contadorS + " series entregadas");
		System.out.println("Hay " + contadorJ + " videojuegos entregados");
	}
	
	public static void serieMasTemporadas(Serie[] array) {
		int mayor = 0;
		for (int i = 1; i < 5; i++) {
			if (array[i].compareTo(array[i - 1])) {
				mayor = i;
			}
		}
		System.out.println("Serie con más temporadas: \n" + array[mayor].toString());
	}
	
	public static void videojuegoMasHoras(Videojuego[] array) {
		int mayor = 0;
		for (int i = 1; i < 5; i++) {
			if (array[i].compareTo(array[i - 1])) {
				mayor = i;
			}
		}
		System.out.println("Videojuego con más horas estimadas: \n" + array[mayor].toString());
	}

	public static void main(String[] args) {
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		
		series = llenarSeries(series);
		videojuegos = llenarVideojuegos(videojuegos);
		
		entregar(series);
		entregar(videojuegos);
		
		contarEntregas(series, videojuegos);
		
		serieMasTemporadas(series);
		videojuegoMasHoras(videojuegos);
	}
}