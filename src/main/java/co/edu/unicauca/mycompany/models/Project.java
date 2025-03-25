package co.edu.unicauca.mycompany.models;

import java.util.List;

public class Project {

    private String name;
    private String company;
    private List<String> requirements;
    private List<String> technologies;
    private int numStudents;
    private String difficulty;

    public Project(String name, String company, List<String> requirements,
            List<String> technologies, int numStudents, String difficulty) {
        this.name = name;
        this.company = company;
        this.requirements = requirements;
        this.technologies = technologies;
        this.numStudents = numStudents;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Proyecto(nombre='" + name + "', empresa='" + company
                + "', requisitos=" + requirements + ", tecnologías=" + technologies
                + ", numEstudiantes=" + numStudents + ", dificultad='" + difficulty + "')";
    }
}
