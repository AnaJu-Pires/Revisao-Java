package revisaoJava;
import java.util.LinkedHashSet;
import java.util.Set;


public class exercicio15 {
    public static void main(String[] args) {
        Set<String> semana = new LinkedHashSet<>();
        System.out.println("\t\tExercicio 15");

        semana.add("Terca");
        semana.add("Domingo");
        semana.add("Sexta");
        semana.add("Segunda");
        semana.add("Quarta");
        semana.add("Sabado");
        semana.add("Quinta");

        System.out.println("\nSemana na ordem de inserção: ");
        for (String sem : semana){
            System.out.println(sem);
        }
        
    }
}
