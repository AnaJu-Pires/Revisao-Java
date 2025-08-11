package revisaoJava.exercicio7;


public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        setNumeroDePortas(numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        System.out.println("\n\tCarro");
        return super.toString() + "\nPortas: " + getNumeroDePortas();
    }
    
}
