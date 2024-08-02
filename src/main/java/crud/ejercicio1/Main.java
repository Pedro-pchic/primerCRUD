package crud.ejercicio1;

import crud.ejercicio1.Estudiantes;
import crud.ejercicio1.actualizarEstudiantes;

import java.sql.SQLException;

import crud.ejercicio1.EliminarEstudiante;
import crud.ejercicio1.leerEstudiantes;

public class Main {
	 public static void main(String[] args) throws SQLException {
	        // Crear un nuevo estudiante
	        
		 	Estudiantes.creatEstudiante("Pedro", "Chic", "2002-03-16", "M", "Residenciales san jose pinula", "555-1234", "pchic40@gmail.com", "", "2024-07-31");
	        Estudiantes.creatEstudiante("Carlos", "Lopez", "1990-03-11", "M", "Zona 1 a. 4 calle 5 ciudad de Guatemala", "5535-1244", "clopez@gmail.com", "", "2024-02-22");
	        Estudiantes.creatEstudiante("Karla", "Castillo", "2000-07-06", "F", "Mixco zona 3, 7avenida calle 3", "1245-7894", "CastilloK@gmail.com", "", "2024-07-31");
	        Estudiantes.creatEstudiante("Alfredo", "Evezt", "2001-12-16", "M", "Villa Nueva zona 4, 3 avenida 5 calle", "0912-4562", "Eveztal@gmail.com", "", "2024-07-31");
	        Estudiantes.creatEstudiante("Luis", "Martini", "2005-12-24", "M", "5 avenida 7 calle, San Jose Pinula", "2354-9032", "LuisM@gmail.com", "", "2024-07-31");
	        Estudiantes.creatEstudiante("Luisa", "Castellena", "2002-08-22", "F", "Zona 10 12 avenida 7 calle, Ciudad de Guatemala", "8912-3489", "CastillaLui@gmail.com", "", "2024-07-31");

		 
	        leerEstudiantes.selectEstudiantes();

	        // Actualizar un estudiante
	        actualizarEstudiantes.updateEstudiante(2, "Juan", "Perez", "2000-01-01", "M", "Calle Falsa 456", "555-5678", "juan.perez@nuevoemail.com", "11", "2024-07-31");

	        // Eliminar un estudiante
	        EliminarEstudiante.deleteEstudiante(1);
	        
	        leerEstudiantes.selectEstudiantes();
	    }	
}
