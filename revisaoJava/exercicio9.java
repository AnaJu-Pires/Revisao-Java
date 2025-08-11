package revisaoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 9");

        List<String> tarefas = new ArrayList<>();
        
        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("\nDigite uma opção: ");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String tarefa = leitor.next();
                    tarefas.add(tarefa);
                    break;
                case 2:
                    System.out.println("Tarefas: ");
                    for (int i = 1; i <= tarefas.size(); i++) {
                        System.out.println(i + " - " + tarefas.get(i-1));
                    }
                    break;
                case 3:
                    System.out.println("Digite o numero da tarefa: ");
                    int num = leitor.nextInt();
                    tarefas.remove(num-1);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    leitor.close();
                    break;
            }
        }
    }
}
