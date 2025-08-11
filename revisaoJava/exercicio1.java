package revisaoJava;

import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\t\tExercicio 1");

        System.out.println("\nDigite a primeira nota: ");
        double num = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double num2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = leitor.nextDouble();

        double media = (num + num2 + num3) / 3;
        
        String mediaFormatada = String.format("%.2f", media);

        if (media >= 7) {
            System.out.println("\n\nAprovado");
        } else if (media >= 5) {
            System.out.println("\n\nRecuperação");
        } else {
            System.out.println("\n\nReprovado");
        }

        leitor.close();

        System.out.println("Média: " + mediaFormatada );

}
}
