package lanchoneteQuase3Lanches;
import java.util.ArrayList;

public class Pedido {
    private String nomeDoCliente;
    private Double taxaDeServiço;
    private ArrayList<Prato> pratos;
    
    public Pedido(String nomeDoCliente, ArrayList<Prato> pratos) {
        this.nomeDoCliente = nomeDoCliente;
        this.pratos = pratos;
    }

    public void calcularTotal() {
        Double total = 0.0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        taxaDeServiço = total * 0.1;
        total += taxaDeServiço;
        System.out.printf("Total: R$ %.2f%n", total);
    }

    public void exibirFatura() {
    calcularTotal();
    System.out.println("Fatura do cliente " + nomeDoCliente);
    
    for (Prato prato : pratos) {
        System.out.printf("%s - %s: R$ %.2f%n", prato.getClass().getSimpleName(), prato.getNome() ,prato.getPreco());
    }
    System.out.printf("Taxa de serviço: R$ %.2f%n", taxaDeServiço);
    calcularTotal();
}

    
}
