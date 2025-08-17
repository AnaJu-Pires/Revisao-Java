package lanchoneteQuase3Lanches;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Prato> pratos = new ArrayList<>();

        Salgadinho coxinha = new Salgadinho("coxinha", 100.00, LocalDate.of(2026, 8, 1), 0.05, "frango", "massa", "frito");
        coxinha.CalcularPreco();
        pratos.add(coxinha);

        Salgadinho esfirra = new Salgadinho("esfirra", 100.00, LocalDate.of(2026, 8, 1), 0.05, "carne", "massa", "assado");
        esfirra.CalcularPreco();
        pratos.add(esfirra);

        Lanche sanduiche = new Lanche("sanduiche", 80.00, LocalDate.of(2026, 8, 1), 0.25, "Frances", "queijo e salada", "tomate");
        sanduiche.CalcularPreco();
        pratos.add(sanduiche);

        Pizza pizza = new Pizza("pizza", 100.00, LocalDate.of(2026, 8, 1), 0.5, "tomate", "calabresa", "sem borda");
        pizza.CalcularPreco();
        pratos.add(pizza);


        Pedido pedido = new Pedido("Joao", pratos);
        pedido.exibirFatura();


    


        
    }
    
}
