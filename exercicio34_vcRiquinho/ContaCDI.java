package exercicio34_vcRiquinho;

public class ContaCDI extends Conta {

    private Double rendimentoDiario;
    private Double taxaDeServico;

    public ContaCDI(Double saldo) {
        super(saldo);
    }

    public Double getRendimentoDiario() {
        return rendimentoDiario;
    }

    public Double getTaxaDeServico() {
        return taxaDeServico;
    }

    
}
