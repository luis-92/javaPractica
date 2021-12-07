package proyecto;

import java.util.Scanner;

public class Reporte extends Cliente{
	
	int numReporte =0;
	int tipoFalla =0;
	String nombreTecnico="";
	int numEmpleado=0;
	String estatus="";
	
	
	public int getNumReporte() {
	return numReporte;
	}
	public void setNumReporte(int numReporte) {
		this.numReporte = numReporte;
	}
	public int getTipoFalla() {
		return tipoFalla;
	}
	public void setTipoFalla(int tipoFalla) {
		this.tipoFalla = tipoFalla;
	}
	
	public String getNombreTecnico() {
		return nombreTecnico;
	}
	public void setNombreTecnico(String nombreTecnico) {
		this.nombreTecnico = nombreTecnico;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	
	//Reporte creado por el cliente
	public void capturarReporte(int numeroTelefono){
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Reporte nuevo");
		System.out.println("Ingresa el tipo de falla: \n");
		System.out.println("1 telefono \n");
		System.out.println("2 internet \n");
		System.out.println("3 telefono e internet \n");

		tipoFalla = in.nextInt();
		setTipoFalla(tipoFalla);
		
		System.out.println("Ingresa la dirección del cliente: \n");
		System.out.println("Formato: Calle,numero,colonia \n");
	}
	
	

	//Reporte creado por el técninco
	public void capturarReporte(int numeroTelefono, int numEmpleado){
		
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Reporte nuevo");
		System.out.println("Ingresa el numero de reporte: \n");
		numReporte = in.nextInt();
		setNumReporte(numReporte);
		
		System.out.println("Ingresa el tipo de falla: \n");
		System.out.println("1 telefono \n");
		System.out.println("2 internet \n");
		System.out.println("3 telefono e internet \n");
		tipoFalla = in.nextInt();
		setTipoFalla(tipoFalla);
		
		System.out.println("Ingresa el nombre del técnico: \n");
		nombreTecnico = in.nextLine();
		setNombreTecnico(nombreTecnico);
		
		System.out.println("Actualiza el estatus del reporte: \n");
		estatus = in.nextLine();
		setEstatus(estatus);
	
		capturarCliente();
	}


}
