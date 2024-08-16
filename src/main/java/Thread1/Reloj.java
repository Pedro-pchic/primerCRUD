package Thread1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj  extends Thread{
	public void run() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		while(true) {
			System.out.println(LocalTime.now().format(formatter));
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
