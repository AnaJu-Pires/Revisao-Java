package lanchoneteQuase3Lanches;
import java.time.LocalDate;

public class Salgadinho extends Prato {
    private String recheio;
    private String massa;
    private String tipo;

    public Salgadinho(String nome, Double preco, LocalDate dataDeValidade, Double peso, String recheio, String massa, String tipo) {
        super(nome, preco, dataDeValidade, peso);
        this.recheio = recheio;
        this.massa = massa;
        this.tipo = tipo;
    }

    @Override
    public void CalcularPreco() {
        if (this.tipo.equals("assado")) {
            this.preco = this.preco  * this.peso * 1.3 ;
        }else {
            this.preco = this.preco * this.peso;
        }
    }
    
}
