import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralConverterTest {
	RomanNumeralConverter conv = null;

	@Before
	public void setUp() throws Exception {
		conv = new RomanNumeralConverter();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDeberiaBotarExcepcionsipasoIIII() {
		try {
			conv.convert("IIII");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaBotarExcepcionsipasoXVV() {
		try {
			conv.convert("XVV");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaBotarExcepcionsipasoMI() {
		try {
			conv.convert("MI");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaBotarExcepcionsipasoXVIIII() {
		try {
			conv.convert("XVIIII");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaBotarExcepcionsipasoMD() {
		try {
			conv.convert("MD");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaBotarExcepcionsipasoMMM() {
		try {
			conv.convert("MMM");
			fail();
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testDeberiaDevolver1SiPasoI() {

		elaborarPrueba("I", 1);

	}

	@Test
	public void testDeberiaDevolver2SiPasoII() {

		elaborarPrueba("II", 2);

	}
	
	@Test
	public void testDeberiaDevolver3SiPasoIII() {

		elaborarPrueba("III", 3);

	}

	@Test
	public void testDeberiaDevolver4SiPasoIV() {
		elaborarPrueba("IV", 4);
	}

	@Test
	public void testDeberiaDevolver5SiPasoV() {
		elaborarPrueba("V", 5);
	}

	@Test
	public void testDeberiaDevolver6SiPasoVI() {
		elaborarPrueba("VI", 6);
	}

	@Test
	public void testDeberiaDevolver8SiPasoVIII() {
		elaborarPrueba("VIII", 8);
	}

	@Test
	public void testDeberiaDevolver9SiPasoIX() {
		elaborarPrueba("IX", 9);
	}

	@Test
	public void testDeberiaDevolver11SiPasoXI() {
		elaborarPrueba("XI", 11);
	}

	@Test
	public void testDeberiaDevolver13SiPasoXIII() {
		elaborarPrueba("XIII", 13);
	}

	@Test
	public void testDeberiaDevolver14SiPasoXIV() {
		elaborarPrueba("XIV", 14);
	}

	@Test
	public void testDeberiaDevolver18SiPasoXVIII() {
		elaborarPrueba("XVIII", 18);
	}

	@Test
	public void testDeberiaDevolver20SiPasoXX() {
		elaborarPrueba("XX", 20);
	}

	@Test
	public void testDeberiaDevolver30SiPasoXXX() {
		elaborarPrueba("XXX", 30);
	}

	@Test
	public void testDeberiaDevolver33SiPasoXXXIII() {
		elaborarPrueba("XXXIII", 33);
	}

	@Test
	public void testDeberiaDevolver40SiPasoXL() {
		elaborarPrueba("XL", 40);
	}

	@Test
	public void testDeberiaDevolver123SiPasoCXXIII() {
		elaborarPrueba("CXXIII", 123);
	}

	@Test
	public void testDeberiaDevolver500SiPasoD() {
		elaborarPrueba("D", 500);
	}

	@Test
	public void testDeberiaDevolver555SiPasoDLV() {
		elaborarPrueba("DLV", 555);
	}

	@Test
	public void testDeberiaDevolver900SiPasoCM() {
		elaborarPrueba("CM", 900);
	}

	@Test
	public void testDeberiaDevolver901SiPasoCMI() {
		elaborarPrueba("CMI", 901);
	}

	@Test
	public void testDeberiaDevolver903SiPasoCMIII() {
		elaborarPrueba("CMIII", 903);
	}

	@Test
	public void testDeberiaDevolver904SiPasoCMIV() {
		elaborarPrueba("CMIV", 904);
	}
	
	@Test
	public void testDeberiaDevolver999SiPasoCMXCIX() {
		elaborarPrueba("CMXCIX", 999);
	}

	@Test
	public void testDeberiaDevolver1000SiPasoM() {
		elaborarPrueba("M", 1000);
	}

	private void elaborarPrueba(String entrada, int esperado) {
		int salida = conv.convert(entrada);
		assertEquals(esperado, salida);
	}

}
