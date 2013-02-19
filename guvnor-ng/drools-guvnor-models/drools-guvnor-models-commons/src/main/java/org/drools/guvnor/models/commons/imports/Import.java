package org.drools.guvnor.models.commons.imports;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class Import {

    private String type;

    public Import() {

    }

    public Import(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }

}