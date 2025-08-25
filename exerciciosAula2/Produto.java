package exerciciosAula2;

public class Produto {
    private String nome;
    private Double preco;
    private String categoria;

    public Produto(String nome, Double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nPreco: " + this.preco + "\nCategoria: " + this.categoria + "\n";
    }
    
}
