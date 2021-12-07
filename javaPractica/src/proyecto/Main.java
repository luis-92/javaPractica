package proyecto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selUsuario =0;
		int numeroTelefono=0;
		int numTecnico=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Selecciona el tipo de usuario que eres:");
		System.out.println("1 Usuario normal \n");
		System.out.println("2 Tecnico \n");
		selUsuario = in.nextInt();

		if(selUsuario == 1) {
			Reporte nuevoReporte = new Reporte();
			
			System.out.println("Ingresa el numero de telefono \n");
			numeroTelefono = in.nextInt();
			
			nuevoReporte.capturarReporte(numeroTelefono);
		}
		
		else if(selUsuario == 2) {
			
			Reporte nuevoReporte = new Reporte();
			
			System.out.println("Ingresa el numero de telefono \n");
			numeroTelefono = in.nextInt();
			
			System.out.println("Ingresa el numero de tecnico \n");
			numTecnico = in.nextInt();
			
			nuevoReporte.capturarReporte(numeroTelefono,numTecnico);
			
			
		}
		
		else {
			System.out.println("No has seleccionado una opcion valida\n");
		}
		
	}

}
