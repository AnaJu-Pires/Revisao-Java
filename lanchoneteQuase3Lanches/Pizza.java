package lanchoneteQuase3Lanches;

import java.time.LocalDate;

public class Pizza extends Prato {
    private String molho;
    private String recheio;
    private String borda;

    public Pizza(String nome, Double preco, LocalDate dataDeValidade, Double peso, String molho, String recheio, String borda) {
        super(nome, preco, dataDeValidade, peso);
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }

    @Override
    public void CalcularPreco() {
        if (!this.borda.equals("sem borda")) {
            this.preco = (this.preco + 2.00) * this.peso;
        }
        this.preco = this.preco * this.peso;

    }
    
}
