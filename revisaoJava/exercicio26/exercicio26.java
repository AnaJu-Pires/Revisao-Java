package revisaoJava.exercicio26;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class exercicio26 {

    public static void main(String[] args) {
        Map<String, List<Produtos>> produtos = new HashMap<>();

        List<Produtos> prodEletronicos = new ArrayList<>();
        prodEletronicos.add(new Produtos("Teclado", 250.00));
        prodEletronicos.add(new Produtos("Monitor", 1500.00));
        prodEletronicos.add(new Produtos("Mouse", 50.00));
        prodEletronicos.add(new Produtos("Fone", 450.00));

        List<Produtos> prodAlimento = new ArrayList<>();
        prodAlimento.add(new Produtos("Arroz", 10.00));
        prodAlimento.add(new Produtos("Feijao", 20.00));
        prodAlimento.add(new Produtos("Batata", 40.00));
        prodAlimento.add(new Produtos("Alface", 50.00));

        produtos.put("Eletronicos", prodEletronicos);
        produtos.put("Alimentos", prodAlimento);

        System.out.println("\t\tExercicio 26");


        System.out.println("Eletronicos: ");
        for(int i = 0; i < produtos.get("Eletronicos").size(); i++){
            System.out.println(produtos.get("Eletronicos").get(i).toString());
        }

    }
    
}

