package revisaoJava;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\t\tExercicio 3");

        int randomnum = (int) (Math.random() * 100);
        int num = 101;
        int tentativas = 0;

        while ( num != randomnum) {

        System.out.println("\nDigite um número: ");
        num = leitor.nextInt();

        if ( num < randomnum) {
            if ( randomnum - num < 10) {
                System.out.println("O numero é um pouco maior");
            } else if ( randomnum - num < 20) {
                System.out.println("O numero é maior");
            } else {
                System.out.println("o numero é muito maior");
            }
        } else {
            if (num - randomnum < 10) {
                System.out.println("O numero é um pouco menor");
            } else if (num - randomnum < 20) {
                System.out.println("O numero é menor");
            } else {
                System.out.println("o numero é muito menor");
            }
        }

        tentativas++;
        }

        leitor.close();

        System.out.println("\nAcertou, o número era: " + randomnum);
        System.out.println("Tentativas: " + tentativas);

    }
}
