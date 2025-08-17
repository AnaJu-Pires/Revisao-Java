package exercicioDeClassesAbstratas;

public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
