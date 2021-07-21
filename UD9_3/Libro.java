package UD9_3;

public class Libro {
	protected String ISBN;
	protected String titulo;
	protected String autor;
	protected int nPaginas;
	
	public Libro(String ISBN, String titulo, String autor, int nPaginas) {
		this.ISBN = ISBN;
		this.autor = autor;
		this.titulo = titulo;
		this.nPaginas = nPaginas;
	}
	
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por " + autor + " tiene " + nPaginas + " páginas.";
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
}