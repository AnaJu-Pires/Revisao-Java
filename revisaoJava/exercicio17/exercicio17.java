package revisaoJava.exercicio17;

import java.util.Set;
import java.util.TreeSet;

public class exercicio17 {
    public static void main(String[] args) {
        
        Set<Produto> produtos = new TreeSet<>();

        produtos.add(new Produto("Teclado", 250.00));
        produtos.add(new Produto("Monitor", 1500.00));
        produtos.add(new Produto("Mouse", 50.00));
        produtos.add(new Produto("Cadeira", 300.00));
        produtos.add(new Produto("Fone", 450.00));

        System.out.println("\t\tExercicio 17");
        
        System.out.println(produtos.toString());
        
    }
}
