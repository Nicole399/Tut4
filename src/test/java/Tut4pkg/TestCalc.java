package tut4;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test() throws IOException  {
			assertTrue(Calc.add(2, 2) == 4);
		}
	

}
