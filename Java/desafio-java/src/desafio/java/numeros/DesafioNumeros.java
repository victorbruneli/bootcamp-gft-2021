package desafio.java.numeros;

import java.util.Scanner;

public class DesafioNumeros {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = Integer.parseInt(leitor.next());

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
        leitor.close();
    }
}
