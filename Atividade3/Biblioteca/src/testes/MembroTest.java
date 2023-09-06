package testes;

import business.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MembroTest {

	Membro membro;
	Livro livro1;
	
	@BeforeEach
	void setUp() throws Exception {
		membro = new Membro("Vitor");
		livro1 = new Livro("Titulo","Vitor");
	}

	@Test
	void testCriarMembro() {
		System.out.println(membro.getId());
		assertEquals(membro.getId(), 2);
		assertEquals(membro.getNome(), "Vitor");
	}

	@Test
	void testMembroPegaEmprestado() {
		membro.pegaLivroEmp(livro1);
		assertEquals(membro.getLivrosEmprestados()[0],livro1);
	}
	
	@Test
	void testMembroRetornaLivro() {
		membro.pegaLivroEmp(livro1);
		assertEquals(membro.getLivrosEmprestados()[0],livro1);
		membro.devolveLivroEmp(livro1);
		assertEquals(membro.getLivrosEmprestados()[0],null);
		
	}

}
