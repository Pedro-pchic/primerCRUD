package Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TareaLenta implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(2000); // Simula un trabajo lento
        return "Resultado de la tarea lenta";
    }
}
