/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.gradle.db.information_schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Settings implements Serializable {

    private static final long serialVersionUID = -1093246920;

    private String name;
    private String value;

    public Settings() {}

    public Settings(Settings value) {
        this.name = value.name;
        this.value = value.value;
    }

    public Settings(
        String name,
        String value
    ) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Settings (");

        sb.append(name);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
