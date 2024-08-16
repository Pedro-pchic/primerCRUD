package ExcutorService1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tarea implements Runnable {
    private String nombre;

    Tarea(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        System.out.println("Ejecutando " + nombre + " en " + Thread.currentThread().getName());
    }
}