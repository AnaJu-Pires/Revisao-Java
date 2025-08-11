package revisaoJava;



public class exercicio4 {
    public static void main(String[] args) {
        
        System.out.println("\t\tExercicio 4");

        int numeros[] = new int[10];
        int soma = 0;

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 11;

        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2 !=0){
                soma += numeros[i];
            }
        }

        System.out.println("Soma: " + soma);




    }
}
