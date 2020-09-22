package ar.edu.unlam.pb2.disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testQuePuedaCrearUnDisco() {
		Integer radioInterior=10;
		Integer radioExterior=20;
		Disco d= new Disco(radioExterior,radioInterior);
		assertNotNull(d);
	}

	@Test
	public void queSeVerfiqueLaSuperficieDeUnDisco() {
		//preparacion
		Integer radioExterior=4;
		Integer radioInterior=2;
		Disco disco = new Disco(radioInterior,radioExterior);
		Double ve=37.69;
		//ejecucion
		Double vo= disco.calcularSuperficie();
		assertEquals(ve, vo,0.01);
	}
}