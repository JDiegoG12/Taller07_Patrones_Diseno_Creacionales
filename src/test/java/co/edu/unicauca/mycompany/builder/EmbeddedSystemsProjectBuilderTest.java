package co.edu.unicauca.mycompany.builder;

import co.edu.unicauca.mycompany.models.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para EmbeddedSystemsProjectBuilder.
 * 
 * Se verifica que cada método de construcción asigne correctamente los valores 
 * a la instancia de Project.
 */
public class EmbeddedSystemsProjectBuilderTest {
    
    /**
     * Prueba unitaria para el método buildName().
     * 
     * Escenario:
     * - Se establece un nombre para el proyecto mediante el builder.
     * - Se verifica que el nombre se haya asignado correctamente en el objeto Project.
     */
    @Test
    public void testBuildName() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        builder.buildName("IoT Device");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("IoT Device"), 
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
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        builder.buildCompany("HardwareTech");
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("HardwareTech"), 
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
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        List<String> requirements = Arrays.asList("Microcontroller", "Embedded C");
        builder.buildRequirements(requirements);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Microcontroller"), 
                "El requisito 'Microcontroller' no se asignó correctamente.");
        assertTrue(project.toString().contains("Embedded C"), 
                "El requisito 'Embedded C' no se asignó correctamente.");
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
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        List<String> technologies = Arrays.asList("Arduino", "Raspberry Pi");
        builder.buildTechnologies(technologies);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("Arduino"), 
                "La tecnología 'Arduino' no se asignó correctamente.");
        assertTrue(project.toString().contains("Raspberry Pi"), 
                "La tecnología 'Raspberry Pi' no se asignó correctamente.");
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
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        builder.buildNumStudents(4);
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("numEstudiantes=4"), 
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
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        builder.buildDifficulty();
        
        Project project = builder.getProject();
        assertTrue(project.toString().contains("dificultad='Alta'"), 
                "La dificultad predeterminada del proyecto no es la esperada.");
    }
}
 