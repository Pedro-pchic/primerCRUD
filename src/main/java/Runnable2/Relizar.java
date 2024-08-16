package Runnable2;

public class Relizar {
	public static void main(String [ ]args) {
		Thread tarea1 = new Thread(new Tarea("Tarea de Programa "));
		Thread tarea2 = new Thread(new Tarea("Tarea de Calculo "));
		Thread tarea3 = new Thread(new Tarea("Tarea de MicroEconomia "));
		
		tarea1.start();
		tarea2.start();
		tarea3.start();
	}
}
