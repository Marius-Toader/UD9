package M3;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class VehiclesApp {
	//Menú principal
	public static void menuPrincipal(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores,
			Hashtable<Integer, Vehiculo> vehiculos, int contadorT, int contadorC, int contadorV) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n"
															+ "1. Crear usuario \n"
															+ "2. Crear vehículo \n"
															+ "3. Salir"));
		switch (n) {
			case 1: menuUsuarios(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			case 2: menuVehiculos(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			case 3: 
				break;
			default: JOptionPane.showMessageDialog(null, "Opción no válida");
				break;
		}
	}
	//Menú para crear usuarios
	public static void menuUsuarios(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores,
			Hashtable<Integer, Vehiculo> vehiculos, int contadorT, int contadorC, int contadorV) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n"
															+ "1. Crear titular de vehículo \n"
															+ "2. Crear conductor \n"
															+ "3. Atrás"));
		switch (n) {
			case 1: 
				TitularDeVehiculo titular = crearTitular();
				titulares.put(contadorT, titular);
				contadorT++;
				menuUsuarios(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			case 2:
				Conductor conductor = crearConductor();
				conductores.put(contadorC, conductor);
				contadorC++;
				menuUsuarios(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			case 3: menuPrincipal(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			default: JOptionPane.showMessageDialog(null, "Opción no válida");
				break;
		}
	}
	//Menú para crear vehículos
	public static void menuVehiculos(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores,
			Hashtable<Integer, Vehiculo> vehiculos, int contadorT, int contadorC, int contadorV) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n"
															+ "1. Coche \n"
															+ "2. Moto \n"
															+ "3. Camión \n"
															+ "4. Atrás"));
		switch (n) {
			case 1: 
				Coche coche = crearCoche(titulares, conductores);
				vehiculos.put(contadorV, coche);
				contadorV++;
				break;
			case 2:
				Moto moto = crearMoto(titulares, conductores);
				vehiculos.put(contadorV, moto);
				contadorV++;
				break;
			case 3:
				Camion camion = crearCamion(titulares, conductores);
				vehiculos.put(contadorV, camion);
				contadorV++;
				break;
			case 4: menuPrincipal(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
				break;
			default: JOptionPane.showMessageDialog(null, "Opción no válida");
				break;
		}
	}
	//Creadores de nuevas personas
	public static TitularDeVehiculo crearTitular() {
		String nombre = JOptionPane.showInputDialog("Nombre:");
		String apellidos = JOptionPane.showInputDialog("Apellidos:");
		String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento:");
		String seguro = JOptionPane.showInputDialog("Tiene seguro?");
		String garajePropio = JOptionPane.showInputDialog("Tiene garaje propio?");
		boolean bSeguro = seguro.equalsIgnoreCase("si");
		boolean bGaraje = garajePropio.equalsIgnoreCase("si");
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Número de licencia:"));
		String tipoLicencia = JOptionPane.showInputDialog("Tipo de licencia:");
		String nombreCompleto = nombre + " " + apellidos;
		String fechaCaducidad = JOptionPane.showInputDialog("Fecha de caducidad de la licencia:");
		
		TitularDeVehiculo titular = new TitularDeVehiculo(nombre, apellidos, fechaNacimiento, bSeguro, bGaraje);
		Licencia licencia = new Licencia(id, tipoLicencia, nombreCompleto, fechaCaducidad);
		titular.setLicencia(licencia);
		
		return titular;
	}
	
	public static Conductor crearConductor() {
		String nombre = JOptionPane.showInputDialog("Nombre:");
		String apellidos = JOptionPane.showInputDialog("Apellidos:");
		String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento:");
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Número de licencia:"));
		String tipoLicencia = JOptionPane.showInputDialog("Tipo de licencia:");
		String nombreCompleto = nombre + " " + apellidos;
		String fechaCaducidad = JOptionPane.showInputDialog("Fecha de caducidad de la licencia:");
		
		Conductor conductor = new Conductor(nombre, apellidos, fechaNacimiento);
		Licencia licencia = new Licencia(id, tipoLicencia, nombreCompleto, fechaCaducidad);
		conductor.setLicencia(licencia);
		
		return conductor;
	}
	//Creadores de nuevos vehículos
	public static Coche crearCoche(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores) {
		Coche coche;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		coche = new Coche(matricula, marca, color);
		ruedasTraseras(coche);
		ruedasDelanteras(coche);
		
		String titularesS = "";
		Enumeration<TitularDeVehiculo> enumerator = titulares.elements();
		while (enumerator.hasMoreElements()) {
			titularesS += enumerator.nextElement().toString() + "\n";
		}
		
		String nombre = JOptionPane.showInputDialog(null, "Asigna un titular. \n"
														+ "Titulares disponibles: \n"
														+ titularesS);
		for (int i = 0; i < titulares.size(); i++) {
			if (nombre.equalsIgnoreCase(titulares.get(i).nombre)) {
				if (titulares.get(i).licencia.tipoLicencia.equalsIgnoreCase("coche")) {
					coche.setTitular(titulares.get(i));
				}
				else {
					JOptionPane.showMessageDialog(null, "El titular no tiene la licencia adecuada.");
				}
			}
		}
 		return coche;
	}
	
	public static Moto crearMoto(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores) {
		Moto moto;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		moto = new Moto(matricula, marca, color);
		ruedaTrasera(moto);
		ruedaDelantera(moto);
		
		String titularesS = "";
		Enumeration<TitularDeVehiculo> enumerator = titulares.elements();
		while (enumerator.hasMoreElements()) {
			titularesS += enumerator.nextElement().toString() + "\n";
		}
		
		String nombre = JOptionPane.showInputDialog(null, "Asigna un titular. \n"
														+ "Titulares disponibles: \n"
														+ titularesS);
		for (int i = 0; i < titulares.size(); i++) {
			if (nombre.equalsIgnoreCase(titulares.get(i).nombre)) {
				if (titulares.get(i).licencia.tipoLicencia.equalsIgnoreCase("moto")) {
					moto.setTitular(titulares.get(i));
				}
				else {
					JOptionPane.showMessageDialog(null, "El titular no tiene la licencia adecuada.");
				}
			}
		}
		
		return moto;
	}
	
	public static Camion crearCamion(Hashtable<Integer, TitularDeVehiculo> titulares, Hashtable<Integer, Conductor> conductores) {
		Camion camion;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		camion = new Camion(matricula, marca, color);
		ruedasTraseras(camion);
		ruedasDelanteras(camion);
		
		String titularesS = "";
		Enumeration<TitularDeVehiculo> enumerator = titulares.elements();
		while (enumerator.hasMoreElements()) {
			titularesS += enumerator.nextElement().toString() + "\n";
		}
		
		String nombre = JOptionPane.showInputDialog(null, "Asigna un titular. \n"
														+ "Titulares disponibles: \n"
														+ titularesS);
		for (int i = 0; i < titulares.size(); i++) {
			if (nombre.equalsIgnoreCase(titulares.get(i).nombre)) {
				if (titulares.get(i).licencia.tipoLicencia.equalsIgnoreCase("camión")) {
					camion.setTitular(titulares.get(i));
				}
				else {
					JOptionPane.showMessageDialog(null, "El titular no tiene la licencia adecuada.");
				}
			}
		}
		return camion;
	}
	//Métodos que sólo se usan en las creaciones de vehículos, cada uno es distinto por los parámetros
	public static void ruedasTraseras(Coche coche) {
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		coche.setMarcaRuedasTraseras(marcaTraseras);
		coche.setDiametroRuedasTraseras(diametroTraseras);
	}
	
	public static void ruedaTrasera(Moto moto) {
		String marcaTrasera = JOptionPane.showInputDialog("Marca de las rueda trasera:");
		double diametroTrasera = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las rueda trasera:"));
		
		moto.setMarcaRuedaTrasera(marcaTrasera);
		moto.setDiametroRuedaTrasera(diametroTrasera);
	}
	
	public static void ruedasTraseras(Camion camion) {
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		camion.setMarcaRuedasTraseras(marcaTraseras);
		camion.setDiametroRuedasTraseras(diametroTraseras);
	}
	
	public static void ruedasDelanteras(Coche coche) {
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		coche.setMarcaRuedasDelanteras(marcaDelanteras);
		coche.setDiametroRuedasDelanteras(diametroDelanteras);
	}
	
	public static void ruedaDelantera(Moto moto) {
		String marcaDelantera = JOptionPane.showInputDialog("Marca de la rueda delantera:");
		double diametroDelantera = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de la rueda delantera:"));
		
		moto.setMarcaRuedaTrasera(marcaDelantera);
		moto.setDiametroRuedaTrasera(diametroDelantera);
	}
	
	public static void ruedasDelanteras(Camion camion) {
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		camion.setMarcaRuedasDelanteras(marcaDelanteras);
		camion.setDiametroRuedasDelanteras(diametroDelanteras);
	}
	//Programa principal
	public static void main(String[] args) {
		Hashtable<Integer, TitularDeVehiculo> titulares = new Hashtable<Integer, TitularDeVehiculo>();
		Hashtable<Integer, Conductor> conductores = new Hashtable<Integer, Conductor>();
		Hashtable<Integer, Vehiculo> vehiculos = new Hashtable<Integer, Vehiculo>();
		int contadorT = 0, contadorC = 0, contadorV = 0;
		menuPrincipal(titulares, conductores, vehiculos, contadorT, contadorC, contadorV);
	}
}