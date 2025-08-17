package exercicioDeClassesAbstratas;

public class TestaCadastro {
    public static void main(String[] args) {

        System.out.println("\t\tCadastro de Funcionários");

        Cliente c1 = new Cliente("Ana", new Data(12, 5, 2000), 101);

        Funcionario f1 = new Funcionario("Carlos", new Data(3, 8, 1990), 1000.00f);

        Gerente g1 = new Gerente("Maria", new Data(3, 8, 1990), 1000.00f, "TI");

        c1.imprimeDados();
        f1.imprimeDados();
        g1.imprimeDados();


    }
}
