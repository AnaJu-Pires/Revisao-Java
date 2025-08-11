package revisaoJava;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class exercicio14 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 14");

        Set<String> emails = new HashSet<>();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar email");
            System.out.println("2 - Listar emails");
            System.out.println("3 - Sair");

            switch (leitor.nextInt()) {
                case 1:
                    System.out.println("Digite o email: ");
                    String email = leitor.next();
                    emails.add(email);
                    System.out.println("O tamanho da lista agora e: " + emails.size());
                    break;
                case 2:
                    System.out.println("Emails: ");
                    for(int i = 1; i <= emails.size(); i++){
                       System.out.println(i + " - " + emails.toArray()[i-1]);
                    }
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
         }
    }
}
