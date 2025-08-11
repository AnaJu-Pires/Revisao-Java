package revisaoJava;

import java.util.LinkedHashMap;

public class exercicio21 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

        produtos.put(1, "Teclado");
        produtos.put(2, "Monitor");
        produtos.put(3, "Mouse");
        produtos.put(4, "Cadeira");
        produtos.put(5, "Fone");

        System.out.println("\t\tExercicio 21");

        for(Integer chave : produtos.keySet()){
            System.out.println(chave + " - " + produtos.get(chave));
        }

    }

}
