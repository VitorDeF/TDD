package testes;

import business.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LivroTest {
	
	Livro livro;
	
	@BeforeEach
	void setUp() throws Exception {
		livro = new Livro("Titulo","Vitor");
	}

	@Test
	void testCriarLivro() {
		assertFalse(livro.isEmprestado());
		assertEquals(livro.getId(), 1);
		assertEquals(livro.getAutor(), "Vitor");
		assertEquals(livro.getTitulo(), "Titulo");
	}

	@Test
	void testEmprestarLivro() {
		assertFalse(livro.isEmprestado());
		assertTrue(livro.emprestaLivro());
	}

	@Test
	void testRetornarLivro() {
		assertTrue(livro.emprestaLivro());
		assertTrue(livro.isEmprestado());
		assertFalse(livro.devolveLivro());
	}
}
