package Runnable2;

import java.util.Random;

public class Tarea implements Runnable {
	private String nombreTarea;
	
	Tarea(String nombreTarea){
		this.nombreTarea = nombreTarea;
	}
	
	public void run() {
		Random random = new Random();
		int tiempoProcesamiento = random.nextInt(10)+ 20;
		
		System.out.println(nombreTarea + " comenzando....");
		
		try {
			Thread.sleep(tiempoProcesamiento);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(nombreTarea + " no completada  "+tiempoProcesamiento +" ms...");
	}
	
}
