package exercicio34_vcRiquinho;


public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "--- DADOS DO CLIENTE ---\n" +
               "Tipo:  Pessoa Física\n" +
               "Nome:  " + getNome() + "\n" +
               "Email: " + getEmail() + "\n" +
               "CPF:   " + this.cpf + "\n" +
               "Contas:" + getContas();
    }

    
}
