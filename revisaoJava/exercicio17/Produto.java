package revisaoJava.exercicio17;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Produto p) {
        return Double.compare(this.getPreco(), p.getPreco());
    }

    @Override
    public String toString() {
        return "\n\nNome: " + getNome() + "\nPreco: " + getPreco();
    }
    
}
