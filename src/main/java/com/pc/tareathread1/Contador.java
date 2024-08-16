package com.pc.tareathread1;

public class Contador extends Thread{
		private String nombre;
		
		Contador(String nombre){
			this.nombre = nombre;
		}
		
		public void run() {
			for( int i = 1; i <= 5; i++) {
				System.out.println(nombre + " : "+ i);
				try {
					Thread.sleep(1000);
				}catch ( InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
