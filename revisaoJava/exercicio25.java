package revisaoJava;

import java.util.ArrayDeque;

public class exercicio25 {

    public static void main(String[] args) {
        ArrayDeque<String> livros = new ArrayDeque<>();
        livros.push("O Senhor dos Aneis");
        livros.push("Harry Potter");
        livros.push("O Hobbit");

        
        System.out.println("Pilha: " + livros);
        System.out.println("Removendo: " + livros.pop());
        System.out.println("Primeiro da pilha: " + livros.peek());
        
    }
        
    
}
