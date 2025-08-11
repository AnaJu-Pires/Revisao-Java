package revisaoJava.exercicio6;

public class Circulo {
    private Double raio;

    public Circulo(Double raio){
        setRaio(raio);
    }

    public Double getRaio(){
        return raio;
    }

    public void setRaio(Double raio){
        if (raio < 0){
            throw new IllegalArgumentException("O raio nao pode ser negativo");
        }else if(raio == 0){
            throw new IllegalArgumentException("O raio nao pode ser zero");
        }
        this.raio = raio;
    }

    public void calcularArea(){
        Double area = Math.PI * raio * raio;
        String areaFormatada = String.format("%.2f", area);
        System.out.println("Area: " + areaFormatada);
    }
}
