package exercicio34_vcRiquinho;
;

public class Main {
    public static void main(String[] args) {

        PessoaFisica cliente1 = new PessoaFisica("João", "jao@email.com", "123.456.789-00");
        cliente1.adicionarConta(new ContaCorrente( 1000.00));
        cliente1. adicionarConta(new ContaInvestimento( 2000.00));
        System.out.println(cliente1);

        PessoaJuridica cliente2 = new PessoaJuridica("Empresa", "emp@email.com", "123.456.789-00");
        cliente2.adicionarConta(new ContaCorrente( 1000.00));
        cliente2.adicionarConta(new ContaCDI( 2000.00));
        System.out.println(cliente2);
        



    }
}
