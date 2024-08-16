package Thread2;

public class Descargas {
	public static void main(String [] args) {
		DescargaArchivo archivo1 = new DescargaArchivo("Archivo1.zip");
		DescargaArchivo archivo2 = new DescargaArchivo("Documento.PDF");
		DescargaArchivo archivo3 = new DescargaArchivo("Documento.docx");
		DescargaArchivo archivo4 = new DescargaArchivo("Documento.txt");
		
		archivo1.start();
		archivo2.start();
		archivo3.start();
		archivo4.start();
	}
}
