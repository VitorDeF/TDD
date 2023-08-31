package testes;

import classes.Calculadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora calc;
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	 public void testSoma() {
		 assertEquals(5, calc.soma(2, 3));
		 assertEquals(-1, calc.soma(2, -3));
	 }
	
	@Test
	 public void testSub() {
		 assertEquals(-1, calc.sub(2, 3));
		 assertEquals(3, calc.sub(6, 3));
	 }
	
	@Test
	 public void testDiv() {
		 assertEquals(0, calc.div(2, 3));
		 assertEquals(2, calc.div(6, 3));
	 }
	
	@Test
	 public void testMult() {
		 assertEquals(6, calc.mult(2, 3));
		 assertEquals(-6, calc.mult(2, -3));
	 }
	
}
