package testes;

import business.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {

	Livro livro1;
	Biblioteca biblioteca;
	Membro membro1;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		livro1 = new Livro("Titulo","Vitor");
		membro1 = new Membro("vitor");
	}

	@Test
	void testRegistrarLivro() {
		biblioteca.registrarLivro(livro1);
		assertEquals(biblioteca.getLivrosRegistrados()[0],livro1);
	}

	@Test
	void testEmprestarLivroParaMembro() {
		biblioteca.registrarLivro(livro1);
		biblioteca.registrarMembro(membro1);
		biblioteca.emprestarLivro(livro1.getId(), membro1.getId());
		assertTrue(livro1.isEmprestado());
	}

	@Test
	void testRetornarLivroDeMembro() {
		fail("Not yet implemented");
	}

	@Test
	void testEmprestarLivroNaoDisponivel() {
		fail("Not yet implemented");
	}
}
