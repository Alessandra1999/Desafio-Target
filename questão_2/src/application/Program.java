package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (verFibo(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci");
        }

        scanner.close();
    }

    // Verificando se um número pertence à sequência de Fibonacci
    public static boolean verFibo(int n) {
        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n;
    }
}

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.



IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */
	
