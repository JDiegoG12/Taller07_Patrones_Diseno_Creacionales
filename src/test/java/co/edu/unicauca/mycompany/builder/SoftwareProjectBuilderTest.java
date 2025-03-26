package co.edu.unicauca.mycompany.builder;

import co.edu.unicauca.mycompany.models.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para SoftwareProjectBuilder.
 * 
 * Se verifica que cada método de construcción asigne correctamente los valores 
 * a la instancia de Project.
 */
public class SoftwareProjectBuilderTest {
    
    /**
     * Prueba unitaria para el método buildName().
     * 
     * Escenario:
     * - Se establece un nombre para el proyecto mediante el builder.
     * - Se verifica que el nombre se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildName() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildName("Web Application");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Web Application"), 
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
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildCompany("SoftCorp");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("SoftCorp"), 
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
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        List<String> requirements = Arrays.asList("RESTful API", "User Authentication");
        builder.buildRequirements(requirements);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("RESTful API"), 
                "El requisito 'RESTful API' no se asignó correctamente.");
        assertTrue(project.toString().contains("User Authentication"), 
                "El requisito 'User Authentication' no se asignó correctamente.");
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
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        List<String> technologies = Arrays.asList("Spring Boot", "React");
        builder.buildTechnologies(technologies);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Spring Boot"), 
                "La tecnología 'Spring Boot' no se asignó correctamente.");
        assertTrue(project.toString().contains("React"), 
                "La tecnología 'React' no se asignó correctamente.");
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
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildNumStudents(3);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("numEstudiantes=3"), 
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
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildDifficulty();
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("dificultad='Baja'"), 
                "La dificultad predeterminada del proyecto no es la esperada.");
    }
}
