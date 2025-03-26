/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mycompany.builder;

import java.util.List;

/**
 * Clase concreta SoftwareProjectBuilder.
 * 
 * Implementa el patrón de diseño Builder para construir instancias de Project 
 * especializadas en proyectos de desarrollo de software.
 */
public class SoftwareProjectBuilder extends ProjectBuilder {

    /**
     * Establece el nombre del proyecto.
     * 
     * @param name Nombre del proyecto.
     */
    @Override
    public void buildName(String name) {
        this.name = name;
    }
    
    /**
     * Establece la empresa solicitante del proyecto.
     * 
     * @param company Nombre de la empresa.
     */
    @Override
    public void buildCompany(String company) {
        this.company = company;
    }

    /**
     * Establece la lista de requisitos del proyecto.
     * 
     * @param requirements Lista de requisitos funcionales y no funcionales.
     */
    @Override
    public void buildRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    /**
     * Establece la lista de tecnologías utilizadas en el proyecto.
     * 
     * @param technologies Lista de tecnologías y herramientas.
     */
    @Override
    public void buildTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    /**
     * Establece el número de estudiantes requeridos para el proyecto.
     * 
     * @param numStudents Cantidad de estudiantes asignados al proyecto.
     */
    @Override
    public void buildNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    /**
     * Establece el nivel de dificultad del proyecto.
     * 
     * En los proyectos de software, la dificultad predeterminada es "Baja".
     */
    @Override
    public void buildDifficulty() {
        this.difficulty = "Baja";
    }
}
