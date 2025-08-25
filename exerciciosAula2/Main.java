package exerciciosAula2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 250.00, "Eletronicos"));
        produtos.add(new Produto("Monitor", 1500.00, "Eletronicos"));
        produtos.add(new Produto("Mouse", 50.00, "Eletronicos"));
        produtos.add(new Produto("Fone", 450.00, "Eletronicos"));

        produtos.add(new Produto("A sombra do corvo", 40.00, "Livros"));
        produtos.add(new Produto("O homem de ferro", 50.00, "Livros"));
        produtos.add(new Produto("O senhor dos aneis", 80.00, "Livros"));
        produtos.add(new Produto("O hobbit", 70.00, "Livros"));
        produtos.add(new Produto("Harry Potter", 100.00, "Livros"));

        System.out.println("\tEletronicos com for");
        for(Produto p : produtos){
            if (p.getCategoria().equals("Eletronicos")) {
                System.out.println(p.toString());
            }
        }

        System.out.println("\tEletronicos com Steam e filter");
        produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletronicos"))
                .forEach(p -> System.out.println(p.toString()));

        
    }
}
