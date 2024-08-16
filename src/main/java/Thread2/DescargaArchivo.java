package Thread2;

public class DescargaArchivo extends Thread{
		private String nombreArchivo;
		
		DescargaArchivo(String nombreArchivo){
			this.nombreArchivo = nombreArchivo;
		}
		
		public void run() {
			int tiempoDescarga = (int) (Math.random()*5000)+100;
			System.out.println("Descargando..."+nombreArchivo + " ... ");
			try {
				Thread.sleep(tiempoDescarga);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Descarga de ..."+nombreArchivo + "completada en..."+tiempoDescarga);
		}
}
