package UD9_3;

public class LibroApp {
	
	public static void masPaginas(Libro libro1, Libro libro2) {
		if (libro1.nPaginas > libro2.nPaginas) {
			System.out.println(libro1.titulo + " tiene más páginas que " + libro2.titulo);
		}
		else if (libro2.nPaginas > libro1.nPaginas) {
			System.out.println(libro2.titulo + " tiene más páginas que " + libro1.titulo);
		}
		else {
			System.out.println(libro1.titulo + " y " + libro2.titulo + " tienen las mismas páginas");
		}
	}

	public static void main(String[] args) {
		Libro libro1 = new Libro("9788416297061", "Els bessons congelats", "Andreu Martín y Jaume Ribera", 340);
		Libro libro2 = new Libro("9788429719444", "Mirall trencat", "Mercè Rodoreda", 416);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		masPaginas(libro1, libro2);
	}
}