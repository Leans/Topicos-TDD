import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJuego() {
		Juego unJuego = new Juego(2, 3, 4, 2, 3, 4, 2, 1, 3, 5, 5, 4, 5, 4, 6, 3, 4, 3, 4, 5);
		//frame 1 [2, 3]
		assertEquals(2, ((Frame)unJuego.getFrame(1)).getIntento1() );
		assertEquals(3, ((Frame)unJuego.getFrame(1)).getIntento2() );
		//frame 2 [4, 2]
		assertEquals(4, ((Frame)unJuego.getFrame(2)).getIntento1() );
		assertEquals(2, ((Frame)unJuego.getFrame(2)).getIntento2() );
		//frame 3 [3, 4]
		assertEquals(3, ((Frame)unJuego.getFrame(3)).getIntento1() );
		assertEquals(4, ((Frame)unJuego.getFrame(3)).getIntento2() );
		//frame 4 [2, 1]
		assertEquals(2, ((Frame)unJuego.getFrame(4)).getIntento1() );
		assertEquals(1, ((Frame)unJuego.getFrame(4)).getIntento2() );
		//frame 5 [3, 5]
		assertEquals(3, ((Frame)unJuego.getFrame(5)).getIntento1() );
		assertEquals(5, ((Frame)unJuego.getFrame(5)).getIntento2() );
		//frame 6 [5, 4]
		assertEquals(5, ((Frame)unJuego.getFrame(6)).getIntento1() );
		assertEquals(4, ((Frame)unJuego.getFrame(6)).getIntento2() );
		//frame 7 [5, 4]
		assertEquals(5, ((Frame)unJuego.getFrame(7)).getIntento1() );
		assertEquals(4, ((Frame)unJuego.getFrame(7)).getIntento2() );
		//frame 8 [6, 3]
		assertEquals(6, ((Frame)unJuego.getFrame(8)).getIntento1() );
		assertEquals(3, ((Frame)unJuego.getFrame(8)).getIntento2() );
		//frame 9 [4, 3]
		assertEquals(4, ((Frame)unJuego.getFrame(9)).getIntento1() );
		assertEquals(3, ((Frame)unJuego.getFrame(9)).getIntento2() );
		//frame 10 [4, 5]
		assertEquals(4, ((Frame)unJuego.getFrame(10)).getIntento1() );
		assertEquals(5, ((Frame)unJuego.getFrame(10)).getIntento2() );
	}
	
	@Test
	public void testPuntuarJuego() {
		Juego unJuego = new Juego(2, 3, 4, 2, 3, 4, 2, 1, 3, 5, 5, 4, 5, 4, 6, 3, 4, 3, 4, 5);
		assertEquals(72, unJuego.puntuarJuego());
	}

}
