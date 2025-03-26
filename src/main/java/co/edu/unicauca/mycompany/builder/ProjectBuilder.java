/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mycompany.builder;

import co.edu.unicauca.mycompany.models.Project;
import java.util.List;

/**
 * Clase abstracta ProjectBuilder.
 * 
 * Define la estructura base para la construcción de objetos Project utilizando el patrón de diseño Builder.
 * Las subclases concretas implementarán los métodos abstractos para construir distintos tipos de proyectos.
 */
public abstract class ProjectBuilder {

    // Atributos del proyecto en construcción
    protected String name;                // Nombre del proyecto
    protected String company;             // Empresa solicitante
    protected List<String> requirements;  // Lista de requisitos del proyecto
    protected List<String> technologies;  // Tecnologías utilizadas en el proyecto
    protected int numStudents;            // Número de estudiantes requeridos
    protected String difficulty;          // Nivel de dificultad del proyecto

    /**
     * Establece el nombre del proyecto.
     * 
     * @param name Nombre del proyecto.
     */
    public abstract void buildName(String name);

    /**
     * Establece la empresa solicitante del proyecto.
     * 
     * @param company Nombre de la empresa.
     */
    public abstract void buildCompany(String company);

    /**
     * Establece la lista de requisitos del proyecto.
     * 
     * @param requirements Lista de requisitos funcionales y no funcionales.
     */
    public abstract void buildRequirements(List<String> requirements);

    /**
     * Establece la lista de tecnologías utilizadas en el proyecto.
     * 
     * @param technologies Lista de tecnologías y herramientas.
     */
    public abstract void buildTechnologies(List<String> technologies);

    /**
     * Establece el número de estudiantes requeridos para el proyecto.
     * 
     * @param numStudents Cantidad de estudiantes asignados al proyecto.
     */
    public abstract void buildNumStudents(int numStudents);

    /**
     * Establece el nivel de dificultad del proyecto.
     * 
     * La implementación concreta en las subclases determinará el nivel de dificultad adecuado.
     */
    public abstract void buildDifficulty();

    /**
     * Devuelve la instancia del proyecto construido.
     * 
     * @return Un objeto Project con los atributos establecidos mediante el builder.
     */
    public Project getProject() {
        return new Project(name, company, requirements, technologies, numStudents, difficulty);
    }
}
