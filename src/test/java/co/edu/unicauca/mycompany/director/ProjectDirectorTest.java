package co.edu.unicauca.mycompany.director;

import co.edu.unicauca.mycompany.builder.DataScienceProjectBuilder;
import co.edu.unicauca.mycompany.builder.ProjectBuilder;
import co.edu.unicauca.mycompany.models.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para ProjectDirector.
 * Se encarga de verificar el correcto funcionamiento de la asignación de builders
 * y la construcción de proyectos con distintos tipos de datos.
 */
public class ProjectDirectorTest {
    
    /**
     * Prueba unitaria para el método setBuilder().
     * 
     * Escenario:
     * - Se crea una instancia de ProjectDirector.
     * - Se establece un ProjectBuilder específico (DataScienceProjectBuilder).
     * - Se construye un proyecto y se verifica que los valores asignados sean correctos.
     */
    @Test
    public void testSetBuilder() {
        // Crear una instancia de ProjectDirector
        ProjectDirector director = new ProjectDirector();
        
        // Crear un ProjectBuilder concreto
        ProjectBuilder builder = new DataScienceProjectBuilder();
        
        // Asignar el builder al director
        director.setBuilder(builder);
        
        // Datos de prueba
        List<String> requirements = Arrays.asList("Machine Learning", "Data Analysis");
        List<String> technologies = Arrays.asList("Python", "TensorFlow");
        
        // Construir un proyecto con los datos de prueba
        Project project = director.buildProject(
            "AI Research", 
            "TechCorp", 
            requirements, 
            technologies, 
            4
        );
        
        // Validaciones: Asegurar que el proyecto se ha creado correctamente
        assertNotNull(project, "El proyecto no debería ser nulo después de la construcción.");
        assertEquals("AI Research", project.toString().split("nombre='")[1].split("'")[0],
                "El nombre del proyecto no coincide con el esperado.");
        assertEquals("TechCorp", project.toString().split("empresa='")[1].split("'")[0],
                "La empresa del proyecto no coincide con la esperada.");
    }

    /**
     * Prueba unitaria para el método buildProject().
     * 
     * Escenario:
     * - Se crea un ProjectDirector y se asigna un DataScienceProjectBuilder.
     * - Se construye un proyecto con datos de prueba.
     * - Se verifica que los valores de salida coincidan con los esperados.
     */
    @Test
    public void testBuildProject() {
        // Crear una instancia de ProjectDirector
        ProjectDirector director = new ProjectDirector();
        
        // Crear un ProjectBuilder concreto
        ProjectBuilder builder = new DataScienceProjectBuilder();
        director.setBuilder(builder);
        
        // Datos de prueba
        String name = "Data Science Project";
        String company = "Analytics Inc";
        List<String> requirements = Arrays.asList("Data Cleaning", "Predictive Modeling");
        List<String> technologies = Arrays.asList("Pandas", "Scikit-learn");
        int numStudents = 3;
        
        // Construcción del proyecto
        Project project = director.buildProject(name, company, requirements, technologies, numStudents);
        
        // Validaciones: Asegurar que el proyecto se ha creado correctamente
        assertNotNull(project, "El proyecto no debería ser nulo después de la construcción.");
        assertTrue(project.toString().contains(name), "El nombre del proyecto no se encuentra en la salida esperada.");
        assertTrue(project.toString().contains(company), "El nombre de la empresa no se encuentra en la salida esperada.");
        assertTrue(project.toString().contains("Mediana"), "La dificultad esperada 'Mediana' no está presente en la salida.");
    }
}
