package Future3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.ArrayList;

class TareaMultiple implements Callable<String> {
    private String nombre;

    TareaMultiple(String nombre) {
        this.nombre = nombre;
    }

    public String call() throws Exception {
        Thread.sleep(1000); // Simula un trabajo que toma 1 segundo
        return nombre + " completada";
    }
}