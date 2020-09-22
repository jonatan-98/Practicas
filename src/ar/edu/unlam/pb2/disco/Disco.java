package ar.edu.unlam.pb2.disco;

public class Disco {


	
	/*Crear una clase que permita modelar un Disco. Se desea conocer: 
	 * • radio interior. 
	 * • radio exterior. 
	 * • perímetro interior. 
	 * • perímetro exterior. 
	 * • superficie. 
	 * Debe tener operaciones para cambiar el radio interior y 
	 * el radio exterior*/

	private Integer radioInterior;
	private Integer radioExterior;
	
	public Disco(Integer radioInterior, Integer radioExterior) {
		
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
	}

	public Integer getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Integer radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public Double calcularSuperficie() {
		return this.radioExterior * this.radioExterior *Math.PI
				-Math.PI*this.radioInterior*this.radioInterior;
	}
	
	public Double calcularPerimetroExterior() {
		return 2*Math.PI*this.radioExterior;
	}
	public Double calcularPerimetroInterior() {
		return 2*Math.PI*this.radioInterior;
	}
}
