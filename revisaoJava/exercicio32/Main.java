package revisaoJava.exercicio32;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        Configuracao configuracao = new Configuracao();

       
        Field campo = configuracao.getClass().getDeclaredField("urlConexao");
        campo.setAccessible(true);
        campo.set(configuracao, "db.producao.com:5432");
        System.out.println(configuracao);
        System.out.println(campo.get(configuracao));
        

        
    }
}
