package exercicio34_vcRiquinho;

public class ProdutoRendaFixa extends Produto{
    private Double rendimentoMensalFixo;
    private int periodoDeCarencia;

    public ProdutoRendaFixa(String nome, String descricao, Double rendimentoMensalFixo, int periodoDeCarencia) {
        super(nome, descricao);
        this.rendimentoMensalFixo = rendimentoMensalFixo;
        this.periodoDeCarencia = periodoDeCarencia;
    }

    public Double getRendimentoMensalFixo() {
        return rendimentoMensalFixo;
    }

    public int getPeriodoDeCarencia() {
        return periodoDeCarencia;
    }
    
}
