package ExcutorService1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {
	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); 

        for (int i = 1; i <= 5; i++) {
            Tarea tarea = new Tarea("Tarea " + i);
            executor.execute(tarea); // Ejecuta la tarea usando el executor
        }

        executor.shutdown(); // Cierra el executor una vez completadas las tareas
    }
}
