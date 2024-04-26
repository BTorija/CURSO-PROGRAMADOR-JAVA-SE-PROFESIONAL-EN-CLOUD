package testing;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import service.PaisesService;

class TestPaisesService {
	static PaisesService service;
	@BeforeAll
	static void setUpBeforeClass() {
		service = new PaisesService();
	} 
	@Test
	void testListaContinentes() {
		assertEquals(7, service.getContinentes().size());
	}

	@Test
	void testListaPaisPorContinente() {
		assertEquals(50, service.getPaisesFiltradosPor("Asia").size());
	}

	@Test
	void testPaisMasPoblado() {
		assertEquals("China", service.getPaisMasPoblado().get().getNombre());
	}

	/*@Test
	void testTablaPorContinente() {
		fail("Not yet implemented");
	}

	@Test
	void testTablaPaisesPorContinente() {
		fail("Not yet implemented");
	}*/

	@Test
	void testPaisPorCapital() {
		assertEquals("Afghanistan", service.getPaisFiltradoPor("Kabul"));
	} 

}