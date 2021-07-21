package M3;

public abstract class Persona {
	
	//Atributos comunes entre personas
	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected Licencia licencia;
	
	//Constructor de persona
	public Persona(String nombre, String apellidos, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Getters y setters
	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
}