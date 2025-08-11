package revisaoJava.exercicio8;

public class Conta {

    private String numero;
    private String titular;
    private double saldo;
    
    public Conta(String numero, String titular, double saldo) {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("\nDeposito realizado com sucesso");
        System.out.println("Novo saldo: " + getSaldo());

    }

    public void sacar(double valor){
        try{
            if (getSaldo() < valor){
                throw new SaldoInsuficienteException("Saldo insuficiente para saque");
            }
            setSaldo(getSaldo() - valor);
            System.out.println("\nSaque realizado com sucesso");
            System.out.println("Novo saldo: " + getSaldo());
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    @Override

    public String toString() {
        return "Numero: " + getNumero() + "\nTitular: " + getTitular() + "\nSaldo: " + getSaldo();
    }


    
}
