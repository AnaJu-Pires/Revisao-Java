package revisaoJava;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class exercicio13 {

    public static void main(String[] args) {

        System.out.println("\t\tExercicio 13");

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 6, 6, 7, 6, 9, 1));

        System.out.println("Lista de numeros: ");
        System.out.println(numeros);

        Set<Integer> numerosSemRepeticao = new HashSet<>(numeros);
        System.out.println("\nLista de numeros sem repetição: ");
        System.out.println(numerosSemRepeticao);
        
    }
    
}
