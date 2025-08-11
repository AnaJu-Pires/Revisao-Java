package revisaoJava.exercicio33;

import java.lang.reflect.Method;

public class ExecutorDeTeste {

    public static void executarTestes(Object obj) {
        Class<?> classe = obj.getClass();

        Method[] metodos = classe.getDeclaredMethods();

        System.out.println("Métodos da classe String:");
        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        MinhaClasseDeTeste obj = new MinhaClasseDeTeste();
        executarTestes(obj);
    }
    
}
