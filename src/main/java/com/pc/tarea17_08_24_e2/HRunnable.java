package com.pc.tarea17_08_24_e2;

public class HRunnable implements Runnable{

	private int id;
	public HRunnable(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("Ejecutandose hilo de id --> "+ id);
		}
	}	

}
