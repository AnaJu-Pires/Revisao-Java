package exercicioDeClassesAbstratas;

public class Funcionario extends Pessoa {
    
    protected Float salario;

    public Funcionario(String nome, Data dataDeNascimento, Float salario) {
        super(nome, dataDeNascimento);
        setSalario(salario);
    }

    public Float getSalario() {
        return salario;
    }

    public Float calcularImposto(Float salario) {
        if (salario <= 0){ {
            throw new IllegalArgumentException("O salario nao pode ser negativo ou zero");
        }}
        return salario - salario * 0.03f;
    }

    public void setSalario(Float salario) {
        this.salario = calcularImposto(salario);
    }
    

    @Override
    public void imprimeDados() {
        System.out.println("Funcionario\n"+"Nome:" +super.getNome() + "; Data de Nascimento: " + super.getDataDeNascimento() + "; Salario: " + getSalario());
    }

    
}
