package lanchoneteQuase3Lanches;

import java.time.LocalDate;

public class Lanche extends Prato {
    private String pao;
    private String recheio;
    private String molho;

    public Lanche(String nome, Double preco, LocalDate dataDeValidade, Double peso, String pao, String recheio, String molho) {
        super(nome, preco, dataDeValidade, peso);
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }

    @Override
    public void CalcularPreco() {
        this.preco = this.preco * this.peso;
        
    }
    
}
