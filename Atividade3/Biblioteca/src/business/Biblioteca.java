package business;

public class Biblioteca {
	
	private Livro[] livrosRegistrados = new Livro[10];
	private Membro[] membrosRegistrados = new Membro[10];
	
	public Livro[] getLivrosRegistrados() {
		return livrosRegistrados;
	}
	
	public void setLivrosRegistrados(Livro[] livrosRegistrados) {
		this.livrosRegistrados = livrosRegistrados;
	}

	public void registrarLivro(Livro livro) {
		int i = 0;
		do {
			if(livrosRegistrados[i]==null)
				livrosRegistrados[i] = livro;
			i++;
		}while(livrosRegistrados[i]!=null);
	}
	public void registrarMembro(Membro membro) {
		int i = 0;
		do {
			if(membrosRegistrados[i]==null)
				membrosRegistrados[i] = membro;
			i++;
		}while(membrosRegistrados[i]!=null);
	}
	
	public void emprestarLivro(int LivroId, int membroId){
		for(int i = 0 ; i<livrosRegistrados.length ; i++) {
			if(livrosRegistrados[i].getId() == LivroId) {
				for(int j = 0 ; j<membrosRegistrados.length ; j++) {
					if(membrosRegistrados[j].getId() == membroId) {
						membrosRegistrados[j].pegaLivroEmp(livrosRegistrados[i]);
					}
				}
			}
		}
	}
	
	public void retornarLivro(int livroId, int membroId) {
		
	}
	
}
