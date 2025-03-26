/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mycompany.director;

import co.edu.unicauca.mycompany.builder.ProjectBuilder;
import co.edu.unicauca.mycompany.models.Project;
import java.util.List;

/**
 * Clase ProjectDirector.
 * 
 * Se encarga de gestionar la construcción de un objeto Project utilizando el patrón Builder.
 * Coordina el proceso de construcción llamando a los métodos del builder en el orden adecuado.
 */
public class ProjectDirector {

    /**
     * Builder encargado de construir el proyecto.
     */
    private ProjectBuilder builder;

    /**
     * Establece el builder que se utilizará para construir el proyecto.
     * 
     * @param builder Instancia de una subclase de ProjectBuilder.
     */
    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

     /**
     * Construye un proyecto utilizando el builder configurado.
     * 
     * @param name         Nombre del proyecto.
     * @param company      Empresa solicitante.
     * @param requirements Lista de requisitos del proyecto.
     * @param technologies Lista de tecnologías utilizadas en el proyecto.
     * @param numStudents  Número de estudiantes requeridos.
     * @return             Objeto Project construido con los valores proporcionados.
     */
    public Project buildProject(String name, String company,
            List<String> requirements,
            List<String> technologies,
            int numStudents) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(requirements);
        builder.buildTechnologies(technologies);
        builder.buildNumStudents(numStudents);
        builder.buildDifficulty();
        return builder.getProject();
    }
}
