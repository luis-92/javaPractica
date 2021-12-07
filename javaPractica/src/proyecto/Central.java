package proyecto;

import java.util.Scanner;

public class Central {

	String nombreCentral = "";
	int numeroCentral = 0;
	
	public String getNombreCentral() {
		return nombreCentral;
	}
	public void setNombreCentral(String nombre) {
		this.nombreCentral = nombre;
	}
	public int getNumeroCentral() {
		return numeroCentral;
	}
	public void setNumeroCentral(int numeroTerminal) {
		this.numeroCentral = numeroTerminal;
	}
	
	public void capturarCentral(){
		
		Scanner in = new Scanner(System.in);

		System.out.println("Central");
		
		System.out.println("Ingresa el número de la Central: \n");
		numeroCentral = in.nextInt();
		setNumeroCentral(numeroCentral);
		
		System.out.println("Ingresa el nombre de la central: \n");
		nombreCentral = in.next();
		setNombreCentral(nombreCentral);
		
	}
}
