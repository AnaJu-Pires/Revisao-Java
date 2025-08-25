package exercicio34_vcRiquinho;


public class PessoaJuridica extends Cliente {
    private String cnpj;
    public PessoaJuridica(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override

    public String toString() {
        return "--- DADOS DO CLIENTE ---\n" +
               "Tipo:  Pessoa Jurídica\n" +
               "Nome:  " + getNome() + "\n" +
               "Email: " + getEmail() + "\n" +
               "CNPJ:  " + this.cnpj + "\n" +
               "Contas:" + getContas();
    }

    
}
