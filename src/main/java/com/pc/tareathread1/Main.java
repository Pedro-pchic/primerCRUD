package com.pc.tareathread1;

public class Main {
	public static void main(String [] args) {
		Contador tarea1 = new Contador("tarea progra 1");
		Contador tarea2 = new Contador("tarea calculo 2");
		
	tarea1.start();
	tarea2.start();
	}
}
