package exercicioDeClassesAbstratas;

public class Gerente extends Funcionario {

    private String Area;

    public Gerente(String nome, Data dataDeNascimento, Float salario, String Area) {
        super(nome, dataDeNascimento, salario);
        setArea(Area);
        calcularImposto(salario);   
    }

    public String getArea() {
        return Area;
    }

    public float calcularImposto(float salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("O salario nao pode ser negativo ou zero");
        }
        return salario - salario * 0.05f;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente\n"+"Nome:" +super.getNome() + "; Data de Nascimento: " + super.getDataDeNascimento() + "; Salario: " + getSalario() + "; Area: " + getArea());
    }
    
}
