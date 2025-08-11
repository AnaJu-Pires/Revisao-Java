package revisaoJava;

import java.util.TreeMap;

public class exercicio22 {
    public static void main(String[] args) {

        System.out.println("\t\tExercicio 22");

        TreeMap<String, Double> alunos = new TreeMap<>();

        alunos.put("João", 10.00);
        alunos.put("Maria", 5.00);
        alunos.put("Paulo", 8.50);
        alunos.put("Ana", 7.80);
        alunos.put("Natalia", 6.47);

        for (String aluno : alunos.keySet()) {
            System.out.println(aluno + " - " + alunos.get(aluno));
        }

    }
}
