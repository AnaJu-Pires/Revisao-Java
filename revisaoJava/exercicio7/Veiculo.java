package revisaoJava.exercicio7;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        super();
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca(){
        return marca;
    }

     public void setMarca (String marca){
       this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\nModelo: " + getModelo();
    }

}
