package test;

import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classes.Relogio;

class RelogioTest {

	Relogio r;
	
	@BeforeEach
	void setUp() throws Exception {
		r = new Relogio();
	}

	@Test
	void programaHorarioTest() {
		r.programaHorario(15, 10, 10);
		assertEquals(r.getHora(), 15);
		assertEquals(r.getMin(), 10);
		assertEquals(r.getSeg(), 10);
		assertNotEquals(r.getHora(), 14);
		assertNotEquals(r.getMin(), 14);
		assertNotEquals(r.getSeg(), 14);
		r.setHora(25);
		assertNotEquals(r.getHora(),25);
	}

	@Test
	void reiniciaHorarioTest() {
		r.programaHorario(15, 10, 10);
		r.reiniciaHorario();
		assertEquals(r.getHora(), 0);
		assertEquals(r.getMin(), 0);
		assertEquals(r.getSeg(), 0);
	}

	@Test
	void cronometroTest() {
		r.reiniciaHorario();
		r.cronometro(1);
		assertEquals(r.imprimeHora24(), "00:00:01");
		r.cronometro(60);
		assertEquals(r.imprimeHora24(), "00:01:01");
	}

	@Test
	void imprimeHora24HTest() {
		r.programaHorario(13, 0, 0);
		assertEquals(r.imprimeHora24(), "13:00:00");
	}

	@Test
	void imprimeHoraAMTest() {
		r.programaHorario(13, 0, 0);
		assertEquals(r.imprimeHoraAM(), "01:00:00 PM");
	}
	
	@Test
	void transformaHoraTest() {
		r.transformaHora();
		assertEquals(r.getHoraAtual(), LocalTime.now());
	}

}
