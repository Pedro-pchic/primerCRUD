package com.pc.tarea17_08_24_e2;

public class Thilo  extends Thread { 
	
	private int id;
	public Thilo(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("Ejecutandose hilo de id --> "+ id);
		}
	}

}
