package exercicioDeClassesAbstratas;

public class Cliente extends Pessoa{

    private int codigo;

    public Cliente(String nome, Data dataDeNascimento, int codigo) {
        super(nome, dataDeNascimento);
        setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprimeDados(){
        System.out.println("Cliente\n"+"Nome:" +super.getNome() + "; Data de Nascimento: " + super.getDataDeNascimento() + "; Codigo: " + getCodigo());
    }
    
}
