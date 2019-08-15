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
public class Collations implements Serializable {

    private static final long serialVersionUID = 1620881416;

    private String name;
    private String key;

    public Collations() {}

    public Collations(Collations value) {
        this.name = value.name;
        this.key = value.key;
    }

    public Collations(
        String name,
        String key
    ) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collations (");

        sb.append(name);
        sb.append(", ").append(key);

        sb.append(")");
        return sb.toString();
    }
}