package atividadeIfeElse;

import java.util.Scanner;

public class Main {
	// Treinando If e Else a little bit 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int idade = 18;
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		sc.close();
		
		// declarando condições 
		if (idade < 18 ) {
			System.out.println("Não pode entrar");
		  } else {
			  System.out.println("Pode entrar");
		  }
	 }
}
