package org.guvnor.asset.management.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.guvnor.common.services.project.model.POM;
import org.guvnor.common.services.project.model.Project;
import org.guvnor.common.services.shared.metadata.model.Metadata;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.backend.vfs.Path;

@Portable
public class ProjectStructureModel {

    private POM pom;

    private Metadata POMMetaData;

    private Path pathToPOM;

    private Path pathToImports;

    private List<String> modules = new ArrayList<String>( );

    private Map<String, Project> modulesProject = new HashMap<String, Project>( );

    private List<Project> orphanProjects = new ArrayList<Project>( );

    private Map<String, POM> orphanProjectsPOM = new HashMap<String, POM>( );

    public ProjectStructureModel() {
    }

    public POM getPOM() {
        return pom;
    }

    public void setPOM( POM pom ) {
        this.pom = pom;
    }

    public void setPOMMetaData( Metadata POMMetaData ) {
        this.POMMetaData = POMMetaData;
    }

    public Metadata getPOMMetaData() {
        return POMMetaData;
    }

    public Path getPathToPOM() {
        return pathToPOM;
    }

    public Path getPathToImports() {
        return pathToImports;
    }

    public void setPathToPOM( Path pathToPOM ) {
        this.pathToPOM = pathToPOM;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules( List<String> modules ) {
        this.modules = modules;
    }

    public boolean isMultiModule() {
        return pom != null;
    }

    public boolean isSingleProject() {
        return orphanProjects != null && orphanProjects.size() == 1;
    }

    public List<Project> getOrphanProjects() {
        return orphanProjects;
    }

    public void setOrphanProjects( List<Project> orphanProjects ) {
        this.orphanProjects = orphanProjects;
    }

    public Map<String, Project> getModulesProject() {
        return modulesProject;
    }

    public void setModulesProject( Map<String, Project> modulesProject ) {
        this.modulesProject = modulesProject;
    }

    public Map<String, POM> getOrphanProjectsPOM() {
        return orphanProjectsPOM;
    }

    public void setOrphanProjectsPOM( Map<String, POM> orphanProjectsPOM ) {
        this.orphanProjectsPOM = orphanProjectsPOM;
    }
}