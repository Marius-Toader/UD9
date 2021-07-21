package M3;

public class Licencia {
	protected int ID;
	protected String tipoLicencia;
	protected String nombreCompleto;
	protected String fechaCaducidad;
	
	//Constructor de licencias
	public Licencia(int ID, String tipoLicencia, String nombreCompleto, String fechaCaducidad) {
		this.ID = ID;
		this.tipoLicencia = tipoLicencia;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}
}