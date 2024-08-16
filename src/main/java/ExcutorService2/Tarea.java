package ExcutorService2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tarea implements Runnable {
    private String nombre;

    Tarea(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        try {
            Thread.sleep(2000); // Simula una tarea que toma 2 segundos
            System.out.println(nombre + " completada en " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

