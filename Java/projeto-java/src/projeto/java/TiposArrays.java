
package projeto.java;

import java.util.Scanner;

public class TiposArrays {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        
        for(int i = 0; i < vetA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetA[i] = scan.nextInt();
        }
        
        for(int i = 0; i < vetA.length; i++){
            vetB[i] = vetA[i];
        }
          
        
    }
}