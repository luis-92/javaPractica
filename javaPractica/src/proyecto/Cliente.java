package proyecto;

import java.util.Scanner;

public class Cliente extends Terminal {
	
	String nombre ="";
	String direccionCliente="";
	int puerto =0;
	int numeroTelefono =0;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccion) {
		this.direccionCliente = direccionCliente;
	}
	public int getPuerto() {
		return puerto;
	}
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public void capturarCliente(){
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Cliente");
			
		System.out.println("Ingresa el nombre del cliente: \n");
		nombre = in.nextLine();
		setNombre(nombre);
		
		System.out.println("Ingresa la dirección del cliente: \n");
		System.out.println("Formato: Calle,numero,colonia \n");
		direccionCliente = in.nextLine();
		setDireccionCliente(direccionCliente);
		
		System.out.println("Ingresa el puerto del cliente: \n");
		puerto = in.nextInt();
		setPuerto(puerto);
		
		System.out.println("Ingresa el numero de cliente: \n");
		numeroTelefono = in.nextInt();
		setNumeroTelefono(numeroTelefono);
		
		capturarTerminal();
	}	
	
	
	
	
	
}
