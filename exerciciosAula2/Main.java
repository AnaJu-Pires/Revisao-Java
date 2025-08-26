package exerciciosAula2;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 250.00, "Eletronicos"));
        produtos.add(new Produto("Monitor", 1500.00, "Eletronicos"));
        produtos.add(new Produto("Mouse", 550.00, "Eletronicos"));
        produtos.add(new Produto("Fone", 450.00, "Eletronicos"));

        produtos.add(new Produto("A sombra do corvo", 40.00, "Livros"));
        produtos.add(new Produto("O homem de ferro", 50.00, "Livros"));
        produtos.add(new Produto("O senhor dos aneis", 80.00, "Livros"));
        produtos.add(new Produto("O hobbit", 600.00, "Livros"));
        produtos.add(new Produto("Harry Potter", 100.00, "Livros"));

        System.out.println("A:");
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


        System.out.println("B:");
        produtos.stream()
                .filter(p -> p.getPreco() > 500)
                .map(p -> p.getNome()+ " - " + p.getPreco())
                .forEach(p -> System.out.println(p.toString()));

        System.out.println("\nC:");
        double precoTotalLivros =produtos.stream()
                    .filter(p -> p.getCategoria().equals("Livros"))
                    .mapToDouble(p -> p.getPreco())
                    .sum();
        System.out.println("Preco total dos livros: " + precoTotalLivros);

        System.out.println("\nD/E:");
        buscarProdutosPorNome(produtos, "Harry Potter");
        buscarProdutosPorNome(produtos, "TituloSla");

        System.out.println("\nF:");
        System.out.println("Nomes dos produtos usando p-> p.getNome():");
        produtos.stream()
                .map(p -> p.getNome())
                .forEach(p -> System.out.println("- " +p));
        System.out.println("\nNomes dos produtos usando Produto::getNome:");
        produtos.stream()
                .map(Produto::getNome)
                .forEach(p -> System.out.println("- " +p));
        

    

        




    }

    public static void buscarProdutosPorNome(List<Produto> produtos, String nome) {

        Optional<Produto> produtoEncontrado = produtos.stream()
            .filter(p -> p.getNome().equals(nome))
            .findFirst();

        if (produtoEncontrado.isPresent()) {
            System.out.println(produtoEncontrado.get().toString());
        } else {
            System.out.println("Produto não encontrado:" + nome);
        }
        
    }
}
