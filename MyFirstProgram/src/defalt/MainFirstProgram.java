package defalt;

import java.util.Scanner;

public class MainFirstProgram {

	public static void main(String[] args) {

			try(Scanner scanner = new Scanner(System.in)) {
				System.out.print("Digite sua idade: ");
			int infoIdade = scanner.nextInt();
			
			if(infoIdade>=18) {
				System.out.println("Você é um adulto!");
			}
			else if(infoIdade>=13) {
				System.out.println("Você é um adolescente.");
			}
			else {
				System.out.println("Você não é adulto!");
			}
		}
	}
}                                                                                                  