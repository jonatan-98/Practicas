package ar.edu.unlam.pb2.cerradura;

public class PruebaCerradura {

	public static void main(String[] args) {
		
		Cerradura cerraduraElectrica = new Cerradura (0,2);
		
		cerraduraElectrica.abrir(1);
		cerraduraElectrica.abrir(1);
		cerraduraElectrica.abrir(1);
		//cerraduraElectrica.estaAbierta(); 
	}
}
