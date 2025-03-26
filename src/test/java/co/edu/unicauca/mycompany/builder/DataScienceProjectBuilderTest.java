package co.edu.unicauca.mycompany.builder;

import co.edu.unicauca.mycompany.models.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para DataScienceProjectBuilder.
 * 
 * Se verifica que cada método de construcción asigne correctamente los valores 
 * a la instancia de Project.
 */
public class DataScienceProjectBuilderTest {
    
    /**
     * Prueba unitaria para el método buildName().
     * 
     * Escenario:
     * - Se establece un nombre para el proyecto mediante el builder.
     * - Se verifica que el nombre se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildName() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        builder.buildName("Machine Learning Project");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Machine Learning Project"), 
                "El nombre del proyecto no se asignó correctamente.");
    }

    /**
     * Prueba unitaria para el método buildCompany().
     * 
     * Escenario:
     * - Se establece una empresa mediante el builder.
     * - Se verifica que la empresa se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildCompany() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        builder.buildCompany("DataTech");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("DataTech"), 
                "El nombre de la empresa no se asignó correctamente.");
    }

    /**
     * Prueba unitaria para el método buildRequirements().
     * 
     * Escenario:
     * - Se establecen requisitos del proyecto mediante el builder.
     * - Se verifica que los requisitos se hayan asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildRequirements() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        List<String> requirements = Arrays.asList("Python", "Machine Learning");
        builder.buildRequirements(requirements);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Python"), 
                "El requisito 'Python' no se asignó correctamente.");
        assertTrue(project.toString().contains("Machine Learning"), 
                "El requisito 'Machine Learning' no se asignó correctamente.");
    }

    /**
     * Prueba unitaria para el método buildTechnologies().
     * 
     * Escenario:
     * - Se establecen tecnologías del proyecto mediante el builder.
     * - Se verifica que las tecnologías se hayan asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildTechnologies() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        List<String> technologies = Arrays.asList("TensorFlow", "Pandas");
        builder.buildTechnologies(technologies);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("TensorFlow"), 
                "La tecnología 'TensorFlow' no se asignó correctamente.");
        assertTrue(project.toString().contains("Pandas"), 
                "La tecnología 'Pandas' no se asignó correctamente.");
    }

    /**
     * Prueba unitaria para el método buildNumStudents().
     * 
     * Escenario:
     * - Se establece el número de estudiantes mediante el builder.
     * - Se verifica que el número de estudiantes se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildNumStudents() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        builder.buildNumStudents(5);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("numEstudiantes=5"), 
                "El número de estudiantes no se asignó correctamente.");
    }

    /**
     * Prueba unitaria para el método buildDifficulty().
     * 
     * Escenario:
     * - Se establece la dificultad del proyecto mediante el builder.
     * - Se verifica que la dificultad se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildDifficulty() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        builder.buildDifficulty();
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("dificultad='Mediana'"), 
                "La dificultad predeterminada del proyecto no es la esperada.");
    }
}
