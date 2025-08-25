package exercicio34_vcRiquinho;

public abstract class Produto {
    protected String nome;
    protected String descricao;
    

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

}
