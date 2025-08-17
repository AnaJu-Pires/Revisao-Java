package exercicioDeClassesAbstratas;


public abstract class Pessoa {

    protected String nome;
    protected Data dataDeNascimento;

    public Pessoa(String nome, Data dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public abstract void imprimeDados();

    /*@Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }*/

    public String getNome() {
        return nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }
}
