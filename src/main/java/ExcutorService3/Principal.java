package ExcutorService3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleAtFixedRate(new TareaRecurrente("Tarea Recurrente"), 0, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000); // Permite que la tarea se ejecute varias veces
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown(); // Detiene el executor
    }
}
