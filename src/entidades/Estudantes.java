package entidades;

public class Estudantes {
	
	private String nome; // atributo da classe
	private String email;
	
	
	public Estudantes(String nome, String email) { // Contrutor, cria uma classe automatico
										
		this.nome = nome;
		this.email = email;
	}


	public String getNome() { // Permite leitura de dados privados por outras classes
		return nome;
	}


	public void setNome(String nome) { // Permite leitura de dados privados por outras classes
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "- Estudante: " + nome + ", Email: "+ email;
	}
	
}


