package proyecto;

import java.util.Scanner;

public class Distrito extends Central {
	
	String nombreDistrito ="";
	int numDistrito=0;
	
	public int getNumDistrito() {
		return numDistrito;
	}
	
	public void setNumDistrito(int numDistrito) {
		this.numDistrito = numDistrito;
	}
	
	public String getNombreDistrito() {
		return nombreDistrito;
	}
	
	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}
	
	public void capturarDistrito(){
			
		Scanner in = new Scanner(System.in);
	
		System.out.println("Distrito");
			
		System.out.println("Ingresa el nombre del distrito: \n");
		nombreDistrito = in.nextLine();
		setNombreDistrito(nombreDistrito);
		
		capturarCentral();

	}

	
	
}
