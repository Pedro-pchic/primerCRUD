package ExcutorService3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class TareaRecurrente implements Runnable {
    private String nombre;

    TareaRecurrente(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        System.out.println(nombre + " ejecutada en " + Thread.currentThread().getName());
    }
}
