package revisaoJava;

import java.util.HashMap;

public class exercicio19 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 19");

        HashMap<String, Integer> texto = new HashMap<>();

        String paragrafo = "Banana Banana Cafe Cafe Cafe texto texto texto texto coisas aleatorias para teste";

        String[] palavras = paragrafo.split(" ");

        for (String palavra : palavras) {
            if (texto.containsKey(palavra)) {
                texto.put(palavra, texto.get(palavra) + 1);
            } else {
                texto.put(palavra, 1);
            }
        }

        System.out.println("\nPalavras e suas quantidades: ");
        for (String palavra : texto.keySet()) {
            System.out.println(palavra + " - " + texto.get(palavra));
        }


    }
}
