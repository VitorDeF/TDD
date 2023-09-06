package business;

public class Membro {
	
	private final int id;
	private static int cont = 0;
	private Livro[] livrosEmp = new Livro[10];
	private String nome;
	
	public static int getCont() {
		return cont;
	}
	public int getId() {
		return id;
	}
	public Livro[] getLivrosEmprestados() {
		return livrosEmp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Membro(String nome) {
		this.id = cont++;
		this.nome = nome;
	}
	
	public void pegaLivroEmp(Livro livro) {
		int i = 0;
		do {
			if(livrosEmp[i]==null)
				livrosEmp[i] = livro;
			i++;
		}while(livrosEmp[i]!=null);
		livro.emprestaLivro();
	}
	
	public void devolveLivroEmp(Livro livro) {
		int i = 0;
		do {
			if(livrosEmp[i]==livro)
				livrosEmp[i] = null;
			i++;
		}while(livrosEmp[i]!=null);
		livro.devolveLivro();
	}
	
	public void listaLivrosEmp() {
		for(Livro L : this.livrosEmp) {
			System.out.println(L.getTitulo());
		}
	}
}
