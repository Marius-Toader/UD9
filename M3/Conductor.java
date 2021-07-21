package M3;

public class Conductor extends Persona {
	
	//Constructor de conductores
	public Conductor(String nombre, String apellidos, String fechaNacimiento) {
		super(nombre, apellidos, fechaNacimiento);
	}

	//Getters y setters
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
}