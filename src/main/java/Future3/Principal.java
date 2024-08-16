package Future3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futuros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Future<String> future = executor.submit(new TareaMultiple("Tarea " + i));
            futuros.add(future);
        }

        for (Future<String> future : futuros) {
            System.out.println("Resultado: " + future.get());
        }

        executor.shutdown();
    }
}
