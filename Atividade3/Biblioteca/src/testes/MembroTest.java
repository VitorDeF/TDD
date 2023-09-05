package testes;

import business.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MembroTest {

	Membro membro;
	Livro livro;
	
	@BeforeEach
	void setUp() throws Exception {
		membro = new Membro("Vitor");
		livro = new Livro("Titulo","Vitor");
	}

	@Test
	void testCriarMembro() {
		System.out.println(membro.getId());
		assertEquals(membro.getId(), 2);
		assertEquals(membro.getNome(), "Vitor");
	}

	@Test
	void testMembroPegaEmprestado() {
		assertTrue(livro.isEmprestado());
	}

	@Test
	void testMembroRetornaLivro() {
		assertFalse(livro.isEmprestado());
	}

}
