package co.edu.unicauca.mycompany.models;

import java.util.List;

/**
 * Representa un proyecto académico gestionado dentro del sistema.
 * 
 * Contiene información sobre el nombre del proyecto, la empresa solicitante,
 * los requisitos, las tecnologías utilizadas, el número de estudiantes requeridos
 * y el nivel de dificultad del proyecto.
 */
public class Project {

    // Atributos del proyecto
    private String name;                // Nombre del proyecto
    private String company;             // Empresa solicitante
    private List<String> requirements;  // Lista de requisitos del proyecto
    private List<String> technologies;  // Tecnologías utilizadas en el proyecto
    private int numStudents;            // Número de estudiantes requeridos
    private String difficulty;          // Nivel de dificultad del proyecto

    
    /**
     * Constructor de la clase Project.
     * 
     * @param name         Nombre del proyecto.
     * @param company      Empresa solicitante.
     * @param requirements Lista de requisitos del proyecto.
     * @param technologies Lista de tecnologías utilizadas.
     * @param numStudents  Número de estudiantes requeridos.
     * @param difficulty   Nivel de dificultad del proyecto.
     */
    public Project(String name, String company, List<String> requirements,
            List<String> technologies, int numStudents, String difficulty) {
        this.name = name;
        this.company = company;
        this.requirements = requirements;
        this.technologies = technologies;
        this.numStudents = numStudents;
        this.difficulty = difficulty;
    }

    /**
     * Devuelve una representación en cadena del objeto Project.
     * 
     * @return Una cadena con los detalles del proyecto en formato legible.
     */
    @Override
    public String toString() {
        return "Proyecto(nombre='" + name + "', empresa='" + company
                + "', requisitos=" + requirements + ", tecnologias=" + technologies
                + ", numEstudiantes=" + numStudents + ", dificultad='" + difficulty + "')";
    }
}
