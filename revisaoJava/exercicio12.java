package revisaoJava;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exercicio12 {
    

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\t\tExercicio 12");

        List<String> cidades = new ArrayList<>();
        
        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");
        cidades.add("Florianopolis");
        cidades.add("Goiania");
        cidades.add("Salvador");
        cidades.add("Manaus");
        cidades.add("Belem");

        System.out.println("\nCidades: ");
        for (int i = 1; i <= cidades.size(); i++) {
            System.out.println(i - 1 + " - " + cidades.get(i - 1));
        }

        System.out.println("\nDigite o nome da sua cidade: ");
        String minhaCidade = leitor.nextLine();

        if (cidades.contains(minhaCidade)) {
            System.out.println("\nCidade encontrada");
            System.out.println("Posição na lista: " + cidades.indexOf(minhaCidade));
        } else {
            System.out.println("\nCidade nao encontrada");
        }

        leitor.close();

    }
}
