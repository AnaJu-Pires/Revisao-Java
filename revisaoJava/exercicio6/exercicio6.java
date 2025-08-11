package revisaoJava.exercicio6;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 6");

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite o raio: ");
        Double raio = leitor.nextDouble();

        Circulo circulo = new Circulo(raio);
        circulo.calcularArea();


        leitor.close();

    }
}
