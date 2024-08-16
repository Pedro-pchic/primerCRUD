package Future2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Principal {
	public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new TareaCancellable());

        Thread.sleep(2000); // Espera 2 segundos y luego intenta cancelar la tarea
        future.cancel(true);

        if (future.isCancelled()) {
            System.out.println("La tarea fue cancelada.");
        } else {
            System.out.println("Resultado: " + future.get());
        }

        executor.shutdown();
    }
}
