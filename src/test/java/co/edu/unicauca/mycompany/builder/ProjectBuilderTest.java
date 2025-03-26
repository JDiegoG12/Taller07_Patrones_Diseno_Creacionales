package co.edu.unicauca.mycompany.builder;

import co.edu.unicauca.mycompany.models.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

/**
 * Clase de pruebas unitarias para la clase abstracta ProjectBuilder.
 * 
 * Se prueba la creación de un proyecto utilizando una implementación de prueba
 * de ProjectBuilder para verificar que los métodos de construcción asignan 
 * correctamente los valores a la instancia de Project.
 */
public class ProjectBuilderTest {
    
    /**
     * Implementación de prueba de ProjectBuilder.
     * 
     * Permite probar la funcionalidad de la clase abstracta sin necesidad de 
     * utilizar una implementación concreta.
     */
    private static class TestProjectBuilder extends ProjectBuilder {
        @Override
        public void buildName(String name) {
            this.name = name;
        }

        @Override
        public void buildCompany(String company) {
            this.company = company;
        }

        @Override
        public void buildRequirements(List<String> requirements) {
            this.requirements = requirements;
        }

        @Override
        public void buildTechnologies(List<String> technologies) {
            this.technologies = technologies;
        }

        @Override
        public void buildNumStudents(int numStudents) {
            this.numStudents = numStudents;
        }

        @Override
        public void buildDifficulty() {
            this.difficulty = "Test Difficulty";
        }
    }

    /**
     * Prueba unitaria para el método getProject().
     * 
     * Escenario:
     * - Se configura un proyecto utilizando TestProjectBuilder.
     * - Se obtiene la instancia de Project creada y se verifica que sus atributos 
     *   contienen los valores esperados.
     */
    @Test
    public void testGetProject() {
        // Crear una instancia de TestProjectBuilder
        TestProjectBuilder builder = new TestProjectBuilder();
        
        // Configurar los atributos del proyecto
        builder.buildName("Test Project");
        builder.buildCompany("Test Company");
        builder.buildRequirements(Arrays.asList("Req1", "Req2"));
        builder.buildTechnologies(Arrays.asList("Tech1", "Tech2"));
        builder.buildNumStudents(2);
        builder.buildDifficulty();
        
        // Obtener la instancia del proyecto construido
        Project project = builder.getProject();
        
        // Validaciones: Asegurar que el proyecto se ha creado correctamente
        assertNotNull(project, "El proyecto no debería ser nulo después de la construcción.");
        assertTrue(project.toString().contains("Test Project"), 
                "El nombre del proyecto no se asignó correctamente.");
        assertTrue(project.toString().contains("Test Company"), 
                "El nombre de la empresa no se asignó correctamente.");
        assertTrue(project.toString().contains("Req1"), 
                "El requisito 'Req1' no se asignó correctamente.");
        assertTrue(project.toString().contains("Tech1"), 
                "La tecnología 'Tech1' no se asignó correctamente.");
        assertTrue(project.toString().contains("numEstudiantes=2"), 
                "El número de estudiantes no se asignó correctamente.");
        assertTrue(project.toString().contains("dificultad='Test Difficulty'"), 
                "La dificultad no se asignó correctamente.");
    }

    // Otras pruebas se han implementado en las clases de prueba de los builders concretos.
}
