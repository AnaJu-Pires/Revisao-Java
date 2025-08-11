package revisaoJava;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class exercicio16 {
    public static void main(String[] args) {
        System.out.println("\t\tExercicio 16");

        Set<String> nomes = new TreeSet<>(Arrays.asList("João", "Maria", "Pedro", "Ana", "Joana"));

        System.out.println("\nNomes em ordem alfabetica: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }



    }
}
