//Tirar duvida com professor

package revisaoJava;

import java.util.LinkedList;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 29");

        Scanner leitor = new Scanner(System.in);

        LinkedList<String> historico = new LinkedList<>();

        historico.add("Pagina 1");
        historico.add("Pagina 2");
        historico.add("Pagina 3");
        historico.add("Pagina 4");
        historico.add("Pagina 5");

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1- Escolher pagina");
            System.out.println("2- Voltar pagina");
            System.out.println("3- Proxima pagina");
            System.out.println("4- Sair");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a pagina: ");
                    String pagina = leitor.next();
                    historico.add(pagina);
                    break;
                case 2:
                    System.out.println("Pagina anterior: " + historico.pollLast());
                    break;
                case 3:
                    System.out.println("Pagina posterior: " + historico.pollFirst());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }


    }
}
