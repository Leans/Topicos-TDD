import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrame() {
		Frame unFrame = new Frame(3, 5);
		assertEquals(3, unFrame.getIntento1());
		assertEquals(5, unFrame.getIntento2());
	}
	
	@Test
	public void testPuntajeInvalidoMayorIntento1() {
		Frame unFrame = new Frame(14, 5);
		//si recibe un puntaje mayor a 10, coloca 10 en el puntaje
		assertEquals(10, unFrame.getIntento1());
		assertEquals(5, unFrame.getIntento2());
	}
	
	@Test
	public void testPuntajeInvalidoMenorIntento1() {
		Frame unFrame = new Frame(-7, 5);
		//si recibe un puntaje menor a 0, coloca 0 en el puntaje
		assertEquals(0, unFrame.getIntento1());
		assertEquals(5, unFrame.getIntento2());
	}
	
	@Test
	public void testPuntajeInvalidoMayorIntento2() {
		Frame unFrame = new Frame(3, 15);
		//si recibe un puntaje mayor a 10, coloca 10 en el puntaje
		assertEquals(3, unFrame.getIntento1());
		assertEquals(10, unFrame.getIntento2());
	}
	
	@Test
	public void testPuntajeInvalidoMenorIntento2() {
		Frame unFrame = new Frame(3, -5);
		//si recibe un puntaje menor a 0, coloca 0 en el puntaje
		assertEquals(3, unFrame.getIntento1());
		assertEquals(0, unFrame.getIntento2());
	}
	
	@Test
	public void testContabilizarPuntaje() {
		Frame unFrame = new Frame(2, 5);
		assertEquals(7, unFrame.ContabilizarPuntaje());
	}
	
	@Test
	public void testEsPleno() {
		Frame unFrame = new Frame(10, 0);
		assertTrue(unFrame.esPleno());
	}
	
	@Test
	public void testNoEsPleno() {
		Frame unFrame = new Frame(3, 5);
		assertFalse(unFrame.esPleno());
	}
	
	@Test
	public void testCrearPlenoInvalido() {
		Frame unFrame = new Frame(10, 5);
		//si se crea un frame pleno, con un numero invalido en el 2do intento se pone a 0
		assertEquals(10, unFrame.getIntento1());
		assertEquals(0, unFrame.getIntento2());
	}

}
