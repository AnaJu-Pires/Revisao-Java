package revisaoJava.exercicio5;

public class exercicio5 {
    
    public static void main(String[] args){

        
        System.out.println("\t\tExercicio 5");

        System.out.println("\nCarro 1:");
        Carro carro = new Carro("Honda", "Civic", 2020);
        carro.exibirInformacoes();

        System.out.println("\nCarro 2:");
        Carro carro2 = new Carro("Toyota", "Corolla", 2021);
        carro2.exibirInformacoes();

    }
}
