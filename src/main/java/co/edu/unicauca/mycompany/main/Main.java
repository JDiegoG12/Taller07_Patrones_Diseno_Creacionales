/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mycompany.main;

import co.edu.unicauca.mycompany.builder.DataScienceProjectBuilder;
import co.edu.unicauca.mycompany.builder.EmbeddedSystemsProjectBuilder;
import co.edu.unicauca.mycompany.builder.ProjectBuilder;
import co.edu.unicauca.mycompany.builder.SoftwareProjectBuilder;
import co.edu.unicauca.mycompany.director.ProjectDirector;
import co.edu.unicauca.mycompany.models.Project;
import java.util.List;

/**
 * Clase principal de la aplicación.
 * 
 * Demuestra el uso del patrón de diseño Builder para la creación de distintos tipos de proyectos.
 * Se construyen proyectos de software, ciencia de datos y sistemas embebidos utilizando 
 * un ProjectDirector y builders específicos para cada tipo de proyecto.
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * 
     * Se crean y configuran proyectos utilizando el patrón Builder, demostrando 
     * la flexibilidad del diseño en la construcción de objetos complejos.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        ProjectDirector director = new ProjectDirector();

        // Construir un proyecto de software
        ProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        Project softwareProject = director.buildProject(
                "Sistema de Gestion de Inventarios",
                "TechCorp",
                List.of("Gestion de productos", "Manejo de stock", "Generacion de reportes"),
                List.of("Java", "Spring Boot", "PostgreSQL"),
                4
        );
        System.out.println(softwareProject);

        // Construir un proyecto de Data Science
        ProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        Project dataScienceProject = director.buildProject(
                "Analisis Predictivo de Ventas",
                "DataCorp",
                List.of("Analisis de tendencias", "Prediccion de demanda", "Optimizacion de inventarios"),
                List.of("Python", "Pandas", "TensorFlow"),
                3
        );
        System.out.println(dataScienceProject);

        // Construir un proyecto de Sistemas Embebidos
        ProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        Project embeddedProject = director.buildProject(
                "Sistema de Monitoreo de Temperatura",
                "IoT Solutions",
                List.of("Sensor de temperatura", "Comunicacion Bluetooth", "Interfaz Web"),
                List.of("C", "Arduino", "ESP32"),
                5
        );
        System.out.println(embeddedProject);
    }
}
