package defalt;

import java.util.Scanner;

public class MainFirstProgram {

	public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua idade a seguir: ");
            int infoIdade = scanner.nextInt();

            if (infoIdade >= 65) {
                System.out.println("Você é um idoso.");
            } else if (infoIdade >= 18) {
                System.out.println("Você é um adulto.");
            } else if (infoIdade >= 13) {
                System.out.println("Você é um adolescente.");
            } else if (infoIdade < 13) {
                System.out.println("Você é uma criança.");
            }
			{
                System.out.println("Encerrando o programa...");
			}
		}
	}

}                                                                                                  


