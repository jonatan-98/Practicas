package ar.edu.unlam.pb2.cerradura;

public class Puerta {

	private Cerradura c1;
	private Cerradura c2;
	
	public Puerta(Cerradura c1, Cerradura c2) {
		this.c1=c1;
		this.c2=c2;
		
	}
	
	public Boolean abrirPuerta() {
		
		if(this.c1.estaAbierta() == true && this.c2.estaAbierta()==true) {
			return true;
		}
		if(this.c1.estaAbierta()==true && this.c2.estaCerrada()==true) {
			return false;
		}
		else return false;
		
	}
}
