package exercicioDeClassesAbstratas;

import java.util.ArrayList;

public class CadastroPessoas {
    private int qtdAtual;
    private ArrayList<Pessoa> pessoas;

    public void cadastraPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        qtdAtual++;
    }

    public void imprimeCadastro(){
        for(int i = 0; i < qtdAtual; i++){
            pessoas.get(i).imprimeDados();
        }
    }


}
