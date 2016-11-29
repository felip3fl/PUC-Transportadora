package a.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import a.transportadora.Transportadora;

public class CalculoDiasTransporte {
	
	Transportadora transp; 
	
	@Before
	public void setUp() throws Exception {
		transp = new Transportadora();
		transp.setCapacidadeDiariaTransporte(100);
	}

	@Test
	public void testCalculoDiasTransporte() {
		assertEquals(transp.calculoDiasTransporte(100), transp.calculoDiasTransporte(100));
	}

}
