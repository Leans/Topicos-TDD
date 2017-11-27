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
		assertTrue(3, unFrame.getIntento1());
		assertTrue(5, unFrame.getIntento2());
	}

}
