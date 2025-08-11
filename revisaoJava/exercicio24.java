package revisaoJava;

import java.util.LinkedList;

public class exercicio24 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 24");

        LinkedList<String> Queue = new LinkedList<>();

        Queue.add("Documento1.pdf");
        Queue.add("Documento2.pdf");
        Queue.add("Documento3.pdf");
        Queue.add("Documento4.pdf");
        Queue.add("Documento5.pdf");

        System.out.println("Fila de impressão: ");
        for (int i = 1; i <= Queue.size(); i++) {
            System.out.println(i + " - " + Queue.get(i-1));
        }

        while (!(Queue.isEmpty())) {
            System.out.println("\nImprimindo: " + Queue.removeFirst());
        }
        
        
    }
}
