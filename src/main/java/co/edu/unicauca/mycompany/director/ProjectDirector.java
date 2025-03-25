/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mycompany.director;

import co.edu.unicauca.mycompany.builder.ProjectBuilder;
import co.edu.unicauca.mycompany.models.Project;
import java.util.List;

public class ProjectDirector {

    private ProjectBuilder builder;

    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

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
