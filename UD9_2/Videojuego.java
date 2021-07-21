package UD9_2;

public class Videojuego implements Entregable{
	private final String TITULO = "";
	private final int HORASESTIMADAS = 10;
	private final boolean ENTREGADO = false;
	private final String GENERO = "";
	private final String COMPAÑIA = "";
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.titulo = TITULO;
		this.horasEstimadas = HORASESTIMADAS;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.compañia = COMPAÑIA;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
		this.genero = GENERO;
		this.compañia = COMPAÑIA;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public String toString() {
		return "Título: " +  titulo + "\n"
				+ "Horas estimadas: " + horasEstimadas + "\n"
				+ "Entregado: " + entregado + "\n"
				+ "Género: " + genero + "\n"
				+ "Compañía: " + compañia;
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
		Videojuego videojuego = new Videojuego();
		videojuego = (Videojuego) a;
		if (horasEstimadas > videojuego.getHorasEstimadas()) {
			return true;
		}
		else {
			return false;
		}
	}
}