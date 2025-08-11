package revisaoJava;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class exercicio10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        System.out.println("\t\tExercicio 10");

        for(int i = 1; i <= 10; i++){
            numeros.add((int)(Math.random() * 100));
        }

        System.out.println("\nNumeros gerados aleatoriamente: ");
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println("\nNumeros em ordem crescente: ");
        System.out.println(numeros);
    }
}

