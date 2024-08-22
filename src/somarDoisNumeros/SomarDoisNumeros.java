package somarDoisNumeros;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
        // Criação do scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Lê o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Soma os dois números
        int soma = numero1 + numero2;

        // Escreve o resultado da soma
        System.out.println("A soma dos dois números é: " + soma);

        // Fecha o scanner
        scanner.close();
	}
}
