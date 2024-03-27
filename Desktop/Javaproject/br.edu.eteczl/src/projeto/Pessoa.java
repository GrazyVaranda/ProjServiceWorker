package projeto;

public class Pessoa {

	private String nome;
	private int idade;
	 
	public Pessoa(String n) {
		this.nome= n;
		this.idade= 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(this.idade>18) {
		this.nome = nome;
		}else {
			System.out.println("Ativar nome somente acima de 18 anos");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
