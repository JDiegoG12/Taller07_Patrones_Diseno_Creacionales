package co.edu.unicauca.mycompany.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para la clase Project.
 * Se encarga de verificar el correcto funcionamiento del método toString().
 */
public class ProjectTest {
    
    /**
     * Prueba unitaria para el método toString() de la clase Project.
     * 
     * Escenario:
     * - Se crea una instancia de Project con valores específicos.
     * - Se verifica que la representación en cadena generada por toString() 
     *   coincida con el formato esperado.
     */
    @Test
    public void testToString() {
        // Datos de prueba
        String name = "Machine Learning Project";
        String company = "TechInnovate";
        List<String> requirements = Arrays.asList("Python", "Data Analysis");
        List<String> technologies = Arrays.asList("TensorFlow", "Pandas");
        int numStudents = 5;
        String difficulty = "Mediana";

        // Creación de la instancia de Project con los datos de prueba
        Project project = new Project(name, company, requirements, technologies, numStudents, difficulty);

        // Representación esperada del objeto en formato de cadena
        String expectedToString = "Proyecto(nombre='" + name + "', empresa='" + company 
                + "', requisitos=" + requirements + ", tecnologías=" + technologies 
                + ", numEstudiantes=" + numStudents + ", dificultad='" + difficulty + "')";

        // Validación: Verificar que la salida de toString() sea la esperada
        assertEquals(expectedToString, project.toString(), 
                "El método toString() no generó la salida esperada.");
    }
}
