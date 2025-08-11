package revisaoJava;

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\t\tExercicio 2");

        System.out.println("\nDigite um número: ");
        int num = leitor.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }

        leitor.close();
    }
   
}
