package revisaoJava;
import java.util.Deque;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 28");
        System.out.println("\nDigite uma frase: ");
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();

        String[] palavras = frase.split(" ");

        Deque<String> pilha = new java.util.ArrayDeque<>();

        for (String palavra : palavras) {
            pilha.push(palavra);
        }

        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }
    }
}
