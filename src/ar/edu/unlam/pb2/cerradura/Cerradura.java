package ar.edu.unlam.pb2.cerradura;

public class Cerradura {

	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estadoDeLaCerradura=false;
	private Boolean bloqueada=false;
	private Integer contadorDeAperturasExitosas;
	private Integer contadorDeAperturasFallidas=0;
	
	public Cerradura(Integer claveDeApertura, Integer
					cantidadDeFallosConsecutivosQueLaBloquean) {
				this.cantidadDeFallosConsecutivosQueLaBloquean=cantidadDeFallosConsecutivosQueLaBloquean;
				this.claveDeApertura=claveDeApertura;
			}
			
			public Boolean abrir(Integer clave) {
				if(bloqueada == false) {
				if(clave == claveDeApertura) {
					//this.contadorDeAperturasExitosas++;
					return estadoDeLaCerradura= true;
					}else {
					this.contadorDeAperturasFallidas++;
					if(contadorDeAperturasFallidas == cantidadDeFallosConsecutivosQueLaBloquean) {
						this.bloqueada=true;
					}else;
					this.estadoDeLaCerradura=false; }
				}else {System.out.println("cerradura bloqueada");}
					 return this.estadoDeLaCerradura;
					
			}
			
			public void cerrar(){
				this.estadoDeLaCerradura=false;
			}
			
			public Boolean estaAbierta() {
				
				if(this.estadoDeLaCerradura == true) {
					return true;
				}else ;return false;
			}
			
			public Boolean estaCerrada() {
				if(this.estadoDeLaCerradura == true) {
					return false;
				}else return true;
			}
			
			public Boolean fueBloqueada() {
				if(this.bloqueada==true) {
					return true;
				}else return false;
			}
			
			public Integer contarAperturasExitosas() {
				return this.contadorDeAperturasExitosas;
			}
			
			public Integer contarAperturasFallidas() {
				return this.contadorDeAperturasFallidas;
			}
}
