package revisaoJava;
import java.util.HashMap;
import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        
        System.out.println("\t\tExercicio 23");

        HashMap<String, String> agenda = new HashMap<>();

        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    leitor.nextLine();
                    System.out.println("Digite o nome: ");
                    String nome = leitor.next();
                    System.out.println("Digite o telefone: ");
                    String telefone = leitor.next();
                    if (agenda.containsKey(nome) || agenda.containsValue(telefone)) {
                        System.out.println("Contato ja cadastrado");
                        break;
                    }
                    agenda.put(nome, telefone);
                    System.out.println("Contato cadastrado com sucesso");
                    break;
                case 2:
                   leitor.close();
                   return;
                default:
                    break;
            }
        }
       

    }
}
