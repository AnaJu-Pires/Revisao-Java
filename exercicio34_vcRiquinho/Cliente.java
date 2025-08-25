package exercicio34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected List<Conta> contas;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();

    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public List<Conta> getContas() {
        return this.contas;
    }


    public void adicionarConta(Conta conta) {
        if (conta != null) {
            this.contas.add(conta);
        }
        
    }


}
