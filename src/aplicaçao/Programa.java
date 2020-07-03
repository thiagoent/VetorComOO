package aplicaçao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudantes;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Le ponto ao inves de virgula
		Scanner sc = new Scanner(System.in);

		Estudantes[] vetor = new Estudantes[10]; // alocando a classe "Estudante" em "vetor"
												 // [] indica vetor
		
		System.out.printf("Quantos estudantes vão se hospedar ");
		
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Dados do estudante ");
			System.out.printf("Nome ");
			sc.nextLine(); // usado para quebrar linha causada pelo uso do sc.nextInt();
			String nome = sc.nextLine();
			
			System.out.printf("Email ");
			String email = sc.nextLine(); // variavel 
			
			System.out.printf("Qual quarto ");
			int quarto=sc.nextInt();
			
			vetor[quarto] = new Estudantes(nome, email); // "vetor[quarto] recebe "(nome, email)" da classe "Estudante"
	    //quarto= posição digitada no comando anterior   // variaveis nome e email so existem em na classe "Programa"
		}

		for (int i = 0; i < 10; i++) {
			
			if(vetor[i]!=null) {
				
				System.out.println("Estudantes cadastrados: ");
				System.out.println("Quarto " + i + vetor[i]);
		}
	

		sc.close();

	}

}
}