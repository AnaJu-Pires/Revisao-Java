package revisaoJava.exercicio8;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 8");

        Scanner leitor = new Scanner(System.in);

        Conta conta = new Conta("123", "Ana", 100);

        while (true) {

            System.out.println("\nDigite uma opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver conta");
            System.out.println("4 - Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor: ");
                    double valor = leitor.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    valor = leitor.nextDouble();
                    conta.sacar(valor);
                    break;
                case 3:
                    System.out.println(conta.toString());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    leitor.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        }

    }
}
