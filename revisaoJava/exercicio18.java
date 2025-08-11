package revisaoJava;

import java.util.HashMap;
import java.util.Scanner;


public class exercicio18 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 18");

        HashMap<String , String> cores = new HashMap<>();
        
        cores.put("vermelho", "red");
        cores.put("verde", "green");
        cores.put("azul", "blue");
        cores.put("amarelo", "yellow");
        cores.put("rosa", "pink");
        cores.put("preto", "black");
        cores.put("branco", "white");

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite uma cor: ");
        String cor = leitor.nextLine();

        if (cores.containsKey(cor)) {
            System.out.println("Traduzindo para inglês: " + cores.get(cor));
        } else {
            System.out.println("Cor nao encontrada");
        }

    }
}
