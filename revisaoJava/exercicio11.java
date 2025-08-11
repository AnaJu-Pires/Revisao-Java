package revisaoJava;
import java.util.LinkedList;

public class exercicio11 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 11");

        LinkedList<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Bia");
        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Eduardo");

        System.out.println("\nFila Inicial: ");
        for (int i = 1; i <= fila.size(); i++) {
            System.out.println(i + " - " + fila.get(i-1));
        }


        System.out.println("\nAtendendo: " + fila.removeFirst());
        System.out.println("Fila Atual: ");
        for (int i = 1; i <= fila.size(); i++) {
            System.out.println(i + " - " + fila.get(i-1));
        }

        System.out.println("\nAtendendo: " + fila.removeFirst());
        System.out.println("Fila Atual: ");
        for (int i = 1; i <= fila.size(); i++) {
            System.out.println(i + " - " + fila.get(i-1));
        }

        System.out.println("\nPacientes prioridades:");
            fila.addFirst("Dona Marcia");
            fila.addFirst("Seu José");
            for (int i = 1; i <= fila.size(); i++) {
                System.out.println(i + " - " + fila.get(i-1));
            }

    }
}
