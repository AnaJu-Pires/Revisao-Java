package revisaoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class exercicio27 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Maria", "Pedro", "Ana", "Ana", "Joao", "Joao", "Paulo", "Maria","Gabriel"));

        System.out.println("\t\tExercicio 27");

        ArrayList<String> nomesSorteados = new ArrayList<>();

        nomes = new ArrayList<>(new HashSet<>(nomes));

        for (int i = 0; i < 3 && !nomes.isEmpty(); i++) {
            int sorteado = (int) (Math.random() * nomes.size());
            nomesSorteados.add(nomes.get(sorteado));
            nomes.remove(sorteado);
        }

        System.out.println("Nomes sorteados: " + nomesSorteados);
    }


}
