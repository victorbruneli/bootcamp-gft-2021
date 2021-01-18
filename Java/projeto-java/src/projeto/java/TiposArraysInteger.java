
package projeto.java;


public class TiposArraysInteger {
    
     // Método printArray para imprimir o array Integer
    public static void printArray(Integer[] inputArray) {
        // exibe elementos do array
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /*
     * Método printArray para imprimir o array Double
     */
    public static void printArray(Double[] inputArray) {
        // exibe elementos do array
        for (Double element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /*
     * Método printArray para imprimir o array Integer
     */
    public static void printArray(Character[] inputArray) {
        // exibe elementos do array
        for (Character element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /*
     * Método printiArray genérico
     */
    public static <E> void printArray(E[] array){
        for(E e: array)
            System.out.printf("%s ", array);
        System.out.println();
    }

    public static void main(String[] args) {
        // criar arrays do Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Conteúdo do array integerArray:");
        printArray(integerArray);
        System.out.println("Conteúdo do array doubleArray:");
        printArray(doubleArray);
        System.out.println("Conteúdo do array characterArray:");
        printArray(characterArray);

    }
}

