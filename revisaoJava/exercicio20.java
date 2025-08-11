package revisaoJava;

import java.util.Scanner;
import java.util.HashMap;

public class exercicio20 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 20");

        HashMap<String, String> agenda = new HashMap<>();

        Scanner leitor = new Scanner(System.in);

        while(true){
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = leitor.next();
                    System.out.println("Digite o telefone: ");
                    String telefone = leitor.next();
                    agenda.put(nome, telefone);
                    break;
                case 2:
                    System.out.println("Contatos: ");
                    for (String contato : agenda.keySet()) {
                        System.out.println(contato + " - " + agenda.get(contato));
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome: ");
                    nome = leitor.nextLine();
                    if (!agenda.containsKey(nome)) {
                        System.out.println("Contato nao encontrado");
                        break;
                    }
                    System.out.println("Telefone: " + agenda.get(nome));
                    break;
                case 4:
                    leitor.close();
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }

    
}
