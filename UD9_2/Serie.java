package UD9_2;

public class Serie implements Entregable{
	private final int TEMPORADAS = 3;
	private final boolean ENTREGADO = false;
	private final String TITULO = "";
	private final String GENERO = "";
	private final String CREADOR = "";
	
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = TITULO;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.creador = CREADOR;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String toString() {
		return "Título: " + titulo + "\n"
				+ "Género: " + genero + "\n"
				+ "Creador: " + creador + "\n"
				+ "Temporadas: " + temporadas + "\n"
				+ "Entregado: " + entregado;
	}

	@Override
	public void entregar() {
		if (!entregado) {
			entregado = true;
		}
	}

	@Override
	public void devolver() {
		if (entregado) {
			entregado = false;
		}
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public boolean compareTo(Object a) {
		Serie serie = new Serie();
		serie = (Serie) a;
		if (temporadas > serie.getTemporadas()) {
			return true;
		}
		else {
			return false;
		}
	}
}