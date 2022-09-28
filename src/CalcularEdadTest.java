import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularEdadTest {

	@Test
	public void test1() {
		System.out.println("Test 1");
		int actual = CalcularEdad.calcularEdad(2000, 9, 30);
		int esperado = 22;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void test2() {
		System.out.println("Test 1");
		int actual = CalcularEdad.calcularEdad(2000, 10, 30);
		int esperado = 21;
		assertEquals(esperado, actual);
	}

}
