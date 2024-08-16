package Runnable1;

public class Inicio {
	public static void main(String [ ]args) {
		Thread corredor1 = new Thread(new Corredor("corredor 1 "));
		Thread corredor2 = new Thread(new Corredor("corredor 2 "));
		Thread corredor3 = new Thread(new Corredor("corredor 3 "));
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
	}
}
