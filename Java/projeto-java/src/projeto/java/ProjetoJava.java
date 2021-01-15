package projeto.java;

import java.util.Scanner;


// Principal - Menu
public class ProjetoJava {
	
	public final static int CAD01 = 1;
	public final static int CAD02 = 2;
	public final static int CAD03 = 3;
	public final static int CAD04 = 4;
        public final static int exit  =  5;
        
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu Principal");
                System.out.println("Digite a opcao desejada: ");
		System.out.println("1 - Dates");
		System.out.println("2 - Arrays");
		System.out.println("3 - ");
		System.out.println("4 - ");
		System.out.println("5 - Sair: ");

		int opcao = entrada.nextInt();

		switch (opcao) {
		case CAD01:
			System.out.println("01 Dates");
			break;
		case CAD02:
			System.out.println("02 Arrays");
			break;
		case CAD03:
			System.out.println("03 ");
			break;
		case CAD04:
			System.out.println("04 ");
			break;
                case exit:
                       System.out.println("Sistema encerrado.");
                    break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}

}