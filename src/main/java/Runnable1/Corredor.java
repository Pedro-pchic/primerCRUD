package Runnable1;
import java.util.Random;

public class Corredor implements Runnable{
	private String nombre;
	
	Corredor(String nombre){
		this.nombre = nombre;
	}

	@Override
	public void run() {
		Random random = new Random();
		int distancia = 0;
		
		while(distancia < 50) {
			distancia += random.nextInt(10);
			System.out.println(nombre +" avanza a "+distancia);
		try {
			Thread.sleep(50);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println(nombre +" ha terminado la carrera !");
	}
		
}
