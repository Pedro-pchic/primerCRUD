package com.pc.tarea17_08_24_e2;

public class HilosApp {
		public static void main(String [] args) {
			Thilo hilo = new Thilo(1);
			hilo.start();
			
			Thread hilo2 = new Thread(new HRunnable(2));
			hilo2.start();
			
			for(int i = 0; i<100; i++) {
				System.out.println("Ejecutandose hilo de id "+ i);
			}
		}
}
