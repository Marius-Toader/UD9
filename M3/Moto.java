package M3;

public class Moto extends Vehiculo {
	protected int numeroRuedas = 2;
	protected String marcaRuedaTrasera;
	protected String marcaRuedaDelantera;
	protected double diametroRuedaTrasera;
	protected double diametroRuedaDelantera;
	
	//Constructor de moto
	public Moto(String matricula, String marca, String color) {
		this.marca = marca;
		if (matriculaCorrecta(matricula)) {
			this.matricula = matricula;
		}
		else {
			this.matricula = "Matrícula incorrecta";
		}
		this.color = color;
		this.marcaRuedaTrasera = "";
		this.marcaRuedaDelantera = "";
		this.diametroRuedaDelantera = 0.0;
		this.diametroRuedaTrasera = 0.0;
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

	public String getMarcaRuedaTrasera() {
		return marcaRuedaTrasera;
	}

	public void setMarcaRuedaTrasera(String marcaRuedaTrasera) {
		this.marcaRuedaTrasera = marcaRuedaTrasera;
	}

	public String getMarcaRuedaDelantera() {
		return marcaRuedaDelantera;
	}

	public void setMarcaRuedaDelantera(String marcaRuedaDelantera) {
		this.marcaRuedaDelantera = marcaRuedaDelantera;
	}

	public double getDiametroRuedaTrasera() {
		return diametroRuedaTrasera;
	}

	public void setDiametroRuedaTrasera(double diametroRuedaTrasera) {
		if (diametroCorrecto(diametroRuedaTrasera)) {
			this.diametroRuedaTrasera = diametroRuedaTrasera;
		}
		else {
			this.diametroRuedaTrasera = 0.0;
		}
	}

	public double getDiametroRuedaDelantera() {
		return diametroRuedaDelantera;
	}

	public void setDiametroRuedaDelantera(double diametroRuedaDelantera) {
		if (diametroCorrecto(diametroRuedaDelantera)) {
			this.diametroRuedaDelantera = diametroRuedaDelantera;
		}
		else {
			this.diametroRuedaDelantera = 0.0;
		}
	}
	
	public void setTitular(TitularDeVehiculo titular) {
		this.titular = titular;
	}
}