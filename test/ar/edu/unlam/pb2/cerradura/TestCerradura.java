package ar.edu.unlam.pb2.cerradura;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {

	@Test
	public void queUnaCerraduraNuevaEstaCerrada(){
	//1. Preparaci�n
	Cerradura miCerradura = new Cerradura(1234, 3);
	//2. Ejecuci�n
	Boolean estadoCerradura = miCerradura.estaAbierta();
	//3. Contrastaci�n
	Assert.assertFalse("", estadoCerradura);
	}
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){
	Cerradura miCerradura = new Cerradura(0, 2);
	miCerradura.abrir(0);
	Boolean estadoCerradura = miCerradura.estaAbierta();
	Assert.assertTrue("", estadoCerradura);
	}
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
	Cerradura miCerradura = new
	Cerradura(4321,30);
	miCerradura.abrir(1234);
	Boolean estadoCerradura = miCerradura.estaAbierta();
	Assert.assertFalse("", estadoCerradura);
	}


}
