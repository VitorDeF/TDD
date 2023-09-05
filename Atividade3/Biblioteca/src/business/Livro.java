package business;

public class Livro {
	private final int id;
	private static int cont = 0;
	private boolean emprestado = false;
	private String titulo, autor;
	
	public int getId() {
		return id;
	}
	public int getCont() {
		return cont;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Livro(String titulo, String autor) {
		this.id = cont++;
		this.emprestado = false;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public boolean emprestaLivro() {
		setEmprestado(true);
		return isEmprestado();
	}

	public boolean devolveLivro() {
		setEmprestado(false);
		return isEmprestado();
	}
}
