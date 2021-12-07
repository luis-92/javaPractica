package proyecto;

import java.util.Scanner;

public class Terminal extends Distrito {
	
	String letra ="";
	int numeroTerminal=0;
	String direccionTerminal="";
	String tipo="";
	
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public int getNumeroTerminal() {
		return numeroTerminal;
	}
	public void setNumeroTerminal(int numeroTerminal) {
		this.numeroTerminal = numeroTerminal;
	}
	public String getDireccionTerminal() {
		return direccionTerminal;
	}
	public void setDireccionTerminal(String direccion) {
		this.direccionTerminal = direccionTerminal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public void capturarTerminal(){
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Terminal");
			
		System.out.println("Ingresa la letra de la terminal: \n");
		letra = in.nextLine();
		setLetra(letra);
		
		System.out.println("Ingresa el número de la terminal: \n");
		numeroTerminal = in.nextInt();
		setNumeroTerminal(numeroTerminal);
		
		System.out.println("Ingresa la dirección de la terminal: \n");
		direccionTerminal = in.nextLine();
		setDireccionTerminal(direccionTerminal);
		
		System.out.println("Ingresa el tipo de la terminal: \n");
		tipo = in.nextLine();
		setTipo(tipo);
		
		capturarDistrito();
	}
	
}
