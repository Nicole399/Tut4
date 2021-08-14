package Tut4pkg;


//import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test() throws IOException  {
			assertTrue(Calc.add(2, 2) == 4);
		}
	@Test
	public void test2() throws IOException  {
			assertTrue(Calc.subtract(2, 2) == 0);
		}
	

}
