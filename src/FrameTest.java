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

}
