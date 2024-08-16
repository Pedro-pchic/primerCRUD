package Future;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Principal {
	public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new TareaLenta());

        System.out.println("Esperando el resultado...");
        String resultado = future.get(); // Espera hasta que la tarea termine y obtiene el resultado
        System.out.println("Resultado: " + resultado);

        executor.shutdown();
    }
}
