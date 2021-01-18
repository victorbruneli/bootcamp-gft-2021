package projeto.java;

import java.util.Scanner;


// Principal - Menu
public class ProjetoJava {
	
	public final static int TiposDates = 1;
	public final static int TiposArrays = 2;
	public final static int TiposArraysInteger = 3;
	public final static int CAD04 = 4;
        public final static int exit  =  5;
        
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

                 while (true) {  
                System.out.print("----------------------------|\n");
		System.out.println("* Menu Principal            |");
                System.out.println("* Digite a opcao desejada:  |");
		System.out.println("1 - Dates                   |");
		System.out.println("2 - Arrays                  |");
		System.out.println("3 -                         |");
		System.out.println("4 -                         |");
		System.out.println("5 - Sair:                   |");
                System.out.print("----------------------------|\n\n");

		int opcao = entrada.nextInt();
                 if (opcao == exit) {
                System.out.println("\n Até logo !");
                entrada.close(); 
                }

		switch (opcao) {
		case 1:
			System.out.println("\n 01 Dates \n");
			break;
		case 2:
			System.out.println("\n 02 Arrays \n");
			break;
		case 3:
			System.out.println("\n 03 \n");
			break;
		case 4:
			System.out.println("\n 04 \n");
			break;
                case 5:
                    System.out.println("\n 05 Exit \n");
                    break;
		default:
			System.out.println("\nOpcao invalida\n");
			break;
		}
	}
    }

}