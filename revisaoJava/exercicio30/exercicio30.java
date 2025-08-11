package revisaoJava.exercicio30;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class exercicio30 {

    public static void main(String[] args) {
        List <Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("João", 10.00));
        alunos.add(new Aluno("Maria", 5.00));
        alunos.add(new Aluno("Paulo", 8.50));
        alunos.add(new Aluno("Ana", 2.80));
        alunos.add(new Aluno("Natalia", 5.47));
        alunos.add(new Aluno("Pedro", 9.00));
        alunos.add(new Aluno("Joaquim", 4.00));

        System.out.println("\t\tExercicio 30");

        Map<String, List<Aluno>> aprovacaoAlunos = new HashMap<>();

        aprovacaoAlunos.put("Aprovados", new ArrayList<>());
        aprovacaoAlunos.put("Reprovados", new ArrayList<>());
        aprovacaoAlunos.put("Recuperacao", new ArrayList<>());

        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                aprovacaoAlunos.get("Aprovados").add(aluno);
            } else if (aluno.getNota() < 7 && aluno.getNota() >= 4) {
                aprovacaoAlunos.get("Recuperacao").add(aluno);
            } else {
                aprovacaoAlunos.get("Reprovados").add(aluno);
            }
        }

        for (String status : aprovacaoAlunos.keySet()) {
            System.out.println("\n" + status + ": ");
            for (Aluno aluno : aprovacaoAlunos.get(status)) {
                System.out.println(aluno.getNome() + " - " + aluno.getNota());
            }
        }

    }
    
}
