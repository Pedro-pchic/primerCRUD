package ExcutorService2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Principal {
	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // Crea un pool de 2 hilos

        for (int i = 1; i <= 3; i++) {
            Tarea tarea = new Tarea("Tarea " + i);
            executor.execute(tarea);
        }

        executor.shutdown(); // No acepta nuevas tareas
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS); // Espera hasta 10 segundos a que terminen todas las tareas
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas han terminado");
    }
}
