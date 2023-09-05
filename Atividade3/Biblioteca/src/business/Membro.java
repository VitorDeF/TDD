package business;

public class Membro {
	
	private final int id;
	private static int cont = 0;
	private String[] livrosEmp;
	private String nome;
	
	public static int getCont() {
		return cont;
	}
	public int getId() {
		return id;
	}
	public String[] getLivrosEmprestados() {
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

}
