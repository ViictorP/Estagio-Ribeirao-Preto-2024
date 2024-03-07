package org.victor;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String entrada = sc.nextLine();
        char[] chars = entrada.toCharArray();
        String reverse = "";
        for (int i = chars.length; i > 0; i--) {
            reverse += chars[i-1];
        }

        System.out.println("String invertida: " + reverse);
        sc.close();
    }
}
