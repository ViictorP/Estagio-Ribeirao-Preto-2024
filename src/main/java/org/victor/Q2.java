package org.victor;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean verificarFibonacci(int numero) {
        if (numero == 0 || numero == 1) return true;

        int a = 0;
        int b = 1;
        int soma = 0;

        while (soma < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return soma == numero;
    }
}
