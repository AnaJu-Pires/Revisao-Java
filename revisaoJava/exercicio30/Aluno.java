package revisaoJava.exercicio30;

public class Aluno {
    
    private String nome;
    private Double nota;

    public Aluno(String nome, Double nota) {
        setNome(nome);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
        if ( nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

