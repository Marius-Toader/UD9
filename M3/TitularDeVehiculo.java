package M3;

public class TitularDeVehiculo extends Persona {
	protected boolean seguro;
	protected boolean garajePropio;
	
	//Constructor de titulares
	public TitularDeVehiculo(String nombre, String apellidos, String fechaNacimiento, boolean seguro, boolean garajePropio) {
		super(nombre, apellidos, fechaNacimiento);
		this.seguro = seguro;
		this.garajePropio = garajePropio;
	}

	//Getters, setters y toString
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha de nacimiento: " + fechaNacimiento + ", Seguro: " + seguro + ", Garaje propio: " + 
				garajePropio + ", ID de licencia: " + licencia.ID + ", Tipo de licencia: " + licencia.tipoLicencia + ", Fecha de caducidad: " + licencia.fechaCaducidad;
	}
}