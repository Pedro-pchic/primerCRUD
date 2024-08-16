package Future2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TareaCancellable implements Callable<String> {
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando tarea...");
            Thread.sleep(1000);
        }
        return "Tarea completada";
    }
}
