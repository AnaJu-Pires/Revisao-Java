package lanchoneteQuase3Lanches;

import java.time.LocalDate;

public abstract class Prato {
    protected String nome;
    protected Double preco;
    protected LocalDate dataDeValidade;
    protected Double peso;

    public Prato(String nome, Double preco, LocalDate dataDeValidade, Double peso) {
        setNome(nome);
        setPreco(preco);
        setDataDeValidade(dataDeValidade);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPreco(Double preco) {
        if (preco > 0) {
            this.preco = preco;
        }else {
            System.out.println("Preco inválido");
        }
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        if (dataDeValidade.isAfter(LocalDate.now())) {
            this.dataDeValidade = dataDeValidade;
        }else {
            System.out.println("Data de validade inválida");
        }
    }

    public void setPeso(Double peso) {
        if (peso > 0) {
            this.peso = peso;
        }else {
            System.out.println("Peso inválido");
        }
    }

    public abstract void CalcularPreco();

    
}
