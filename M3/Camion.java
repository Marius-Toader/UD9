package M3;

public class Camion extends Vehiculo {
	protected int numeroRuedas = 4;
	protected String marcaRuedasTraseras;
	protected String marcaRuedasDelanteras;
	protected double diametroRuedasTraseras;
	protected double diametroRuedasDelanteras;
	
	//Constructor de camión
	public Camion(String matricula, String marca, String color) {
		this.marca = marca;
		if (matriculaCorrecta(matricula)) {
			this.matricula = matricula;
		}
		else {
			this.matricula = "Matrícula incorrecta";
		}
		this.color = color;
		this.marcaRuedasTraseras = "";
		this.marcaRuedasDelanteras = "";
		this.diametroRuedasDelanteras = 0.0;
		this.diametroRuedasTraseras = 0.0;
	}
	
	//Comprobación de la matrícula
	private boolean matriculaCorrecta(String matricula) {
		boolean valido;
		int contadorLetras = 0, contadorNumeros = 0;
		for (int i = 0; i < matricula.length(); i++) {
			if (matricula.charAt(i) >='A' && matricula.charAt(i) <= 'Z') {
				contadorLetras++;
			}
			else if (matricula.charAt(i) >= 0 && matricula.charAt(i) <= 9) {
				contadorNumeros++;
			}
		}
		if (((contadorLetras == 2) || (contadorLetras == 3)) && contadorNumeros == 4) {
			valido = true;
		}
		else {
			valido = false;
		}
		
		return valido;
	}
	
	//Comprobación del diámetro de las ruedas
	private boolean diametroCorrecto(double diametro) {
		boolean valido;
		if (diametro > 0.4 && diametro < 4) {
			valido = true;
		}
		else {
			valido = false;
		}
		
		return valido;
	}

	//Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getMarcaRuedasTraseras() {
		return marcaRuedasTraseras;
	}

	public void setMarcaRuedasTraseras(String marcaRuedasTraseras) {
		this.marcaRuedasTraseras = marcaRuedasTraseras;
	}

	public String getMarcaRuedasDelanteras() {
		return marcaRuedasDelanteras;
	}

	public void setMarcaRuedasDelanteras(String marcaRuedasDelanteras) {
		this.marcaRuedasDelanteras = marcaRuedasDelanteras;
	}

	public double getDiametroRuedasTraseras() {
		return diametroRuedasTraseras;
	}

	public void setDiametroRuedasTraseras(double diametroRuedasTraseras) {
		if (diametroCorrecto(diametroRuedasTraseras)) {
			this.diametroRuedasTraseras = diametroRuedasTraseras;
		}
		else {
			this.diametroRuedasTraseras = 0.0;
		}
	}

	public double getDiametroRuedasDelanteras() {
		return diametroRuedasDelanteras;
	}

	public void setDiametroRuedasDelanteras(double diametroRuedasDelanteras) {
		if (diametroCorrecto(diametroRuedasDelanteras)) {
			this.diametroRuedasDelanteras = diametroRuedasDelanteras;
		}
		else {
			this.diametroRuedasDelanteras = 0.0;
		}
	}
	
	public void setTitular(TitularDeVehiculo titular) {
		this.titular = titular;
	}
}
